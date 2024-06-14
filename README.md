# Minor_1

**MAZE MASTER**

Maze Master is a Java application that generates and solves random mazes. The application allows users to create mazes using different algorithms and then solve them using various pathfinding techniques. The graphical interface is built using Swing, and the maze generation and solving algorithms are implemented in pure Java.

**FEATURES>>**

**Maze Generation:** Generate random mazes using the Depth-First Search (DFS) algorithm.

**Maze Solving:** Solve mazes using Depth-First Search (DFS), Breadth-First Search (BFS), or A* algorithm.

**Saving and Loading:** Save and load the state of the maze to/from a file.

**Export Maze:** Export the generated maze as a PNG image.

**Adjustable Speed:** Control the speed of maze generation and solving.


**INSTALLATION>>**

**Clone the repository:**

git clone https://github.com/your-username/maze-master.git

**Navigate to the project directory:**

cd maze-master

**Compile the project:**

javac MazeApp.java

**Run the application:**

java MazeApp

**USAGE>>**

**Generate Maze:** Click the "Generate Maze" button to create a new random maze.

**Solve Maze:** Click the "Solve Maze" button to solve the maze using the selected algorithm from the dropdown menu.

**Reset Maze:** Click the "Reset" button to stop the current generation/solving process and reset the maze.

**Save Maze:** Click the "Save Maze" button to save the current state of the maze.

**Load Maze:** Click the "Load Maze" button to load a previously saved maze.

**Export Maze:** Click the "Export Maze" button to save the current maze as a PNG image.

**Adjust Speed:** Use the slider on the left to adjust the speed of the maze generation and solving.


**ALGORITHMS>>**

**Maze Generation --**

**Depth-First Search (DFS):** The algorithm starts at the initial cell and explores as far as possible along each branch before backtracking.

**Maze Solving --**

**Depth-First Search (DFS):** The algorithm starts at the initial cell and explores as far as possible along each branch before backtracking.

**Breadth-First Search (BFS):** The algorithm explores all neighbors at the present depth prior to moving on to nodes at the next depth level.

**A STAR:** The algorithm uses a heuristic to find the shortest path from the start to the end

**PROJECT STRUCTURE>>**

**MazeApp.java:** The main class that sets up the GUI and handles the maze generation and solving logic.

**MazePanel.java:** A custom JPanel that handles the drawing of the maze.

**CONTRIBUTING>>**

Fork the repository.

Create your feature branch (git checkout -b feature/fooBar).

Commit your changes (git commit -am 'Add some fooBar').

Push to the branch (git push origin feature/fooBar).

Create a new Pull Request.
