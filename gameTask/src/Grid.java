import java.util.Random;

class Grid {
    private final int[][] grid;
    private final int n;

    // Constructor to initialize an n x n grid with 0's and a 2 at position (0, 0)
    public Grid(int n) {
        this.n = n;
        grid = new int[n][n];

        // Fill the grid with 0's
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = 0;
            }
        }

        // Place a 2 in the top left corner (0, 0)
        grid[0][0] = 2;
    }

    // Method to return the row at index i
    public Line getRow(int i)
    {
        Line line = new Line(n);
        for (int j = 0; j < n; j++)
        {
            line.updateLine(j, grid[i][j]);
        }
        return line;
    }

    // Method to return the row at index i in reverse order
    public Line getRowReverse(int i)
    {
        Line line = new Line(n);
        for (int j = 0; j < n; j++)
        {
            line.updateLine(j, grid[i][n - 1 - j]);
        }
        return line;
    }

    // Method to return the column at index i
    public Line getColumn(int i)
    {
        Line line = new Line(n);
        for (int j = 0; j < n; j++)
        {
            line.updateLine(j, grid[j][i]);
        }
        return line;
    }

    // Method to return the column at index i in reverse order
    public Line getColumnReverse(int i)
    {
        Line line = new Line(n);
        for (int j = 0; j < n; j++)
        {
            line.updateLine(j, grid[n - 1 - j][i]);
        }
        return line;
    }

    // Method to add a random '2' to an empty spot in the grid
    private void addRandomTwo()
    {
        Random rand = new Random();
        int x, y;
        do
        {
            x = rand.nextInt(n);
            y = rand.nextInt(n);
        } while (grid[x][y] != 0);  // Ensure the spot is empty
        grid[x][y] = 2;
    }

    // Method to move Up
    public void moveUp()
    {
        for (int i = 0; i < n; i++)
        {
            Line line = getColumn(i);

            // After movement, add random '2'
            addRandomTwo();
        }
    }

    // Method to move Down
    public void moveDown()
    {
        for (int i = 0; i < n; i++)
        {
            Line line = getColumnReverse(i);
            // Move and merge logic for down
            // After movement, add random '2'
            addRandomTwo();
        }
    }

    // Method to move Left
    public void moveLeft()
    {
        for (int i = 0; i < n; i++)
        {
            Line line = getRow(i);
            // Move and merge logic for left
            // After movement, add random '2'
            addRandomTwo();
        }
    }

    // Method to move Right
    public void moveRight()
    {
        for (int i = 0; i < n; i++)
        {
            Line line = getRowReverse(i);
            // Move and merge logic for right
            // After movement, add random '2'
            addRandomTwo();
        }
    }
}

