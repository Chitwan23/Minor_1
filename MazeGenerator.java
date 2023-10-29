import java.util.Random;

public class MazeGenerator {

    private static final int WALL = 1;
    private static final int PATH = 0;
    private static final int ENTRY = 2;
    private static final int EXIT = 3;

    private int[][] maze;
    private int rows;
    private int columns;

    public MazeGenerator(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.maze = new int[rows][columns];
    }

    public void generateMaze() {
        // Initialize the maze with walls.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                maze[i][j] = WALL;
            }
        }

        // Set the entry and exit points.
        int entryRow = (int) (Math.random() * rows);
        // int entryColumn = (int) (Math.random() * columns);
        maze[entryRow][0] = ENTRY;

        // int exitRow = (int) (Math.random() * rows);
        int exitColumn = (int) (Math.random() * columns);
        maze[0][exitColumn] = EXIT;

        // Generate the maze using a depth-first search.
        dfs(entryRow, 0);
    }

    private void dfs(int row, int column) {
        // Mark the current cell as visited.
        maze[row][column] = PATH;

        // Get a list of all the unvisited neighbors.
        int[][] neighbors = getNeighbors(row, column);

        // Randomly shuffle the neighbors.
        Random random = new Random();
        for (int i = 0; i < neighbors.length; i++) {
            for (int j = 0; j < neighbors[i].length; j++) {
                int index = random.nextInt(neighbors.length);
                swap(neighbors[index][0], neighbors[i][0]);
                swap(neighbors[index][1], neighbors[i][1]);
            }
        }

        for (int[] neighbor : neighbors) {
            if (maze[neighbor[0]][neighbor[1]] == WALL) {
                dfs(neighbor[0], neighbor[1]);
            }
        }
    }

    private int[][] getNeighbors(int row, int column) {
        int[][] neighbors = new int[4][2];

        // North neighbor.
        neighbors[0][0] = row - 1<0?0:row-1;
        neighbors[0][1] = column;

        // South neighbor.
        neighbors[1][0] = row + 1>row?row:row+1;
        neighbors[1][1] = column;

        // West neighbor.
        neighbors[2][0] = row;
        neighbors[2][1] = column - 1<0?0:column-1;

        // East neighbor.
        neighbors[3][0] = row;
        neighbors[3][1] = column + 1>column?column:column+1;

        return neighbors;
    }

    public int[][] getMaze() {
        return maze;
    }

    private void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

    public static void main(String[] args) {
        MazeGenerator mazeGenerator = new MazeGenerator(10, 10);
        mazeGenerator.generateMaze();

        int[][] maze = mazeGenerator.getMaze();

        // Print the maze to the console.
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }

    }
}
