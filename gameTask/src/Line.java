class Line
{
    private final int[] line;

    // Constructor method to create row of 0's
    public Line(int n)
    {
        line = new int[n];
        for (int i = 0; i < n; i++)
        {
            line[i] = 0;
        }
    }

    // Method to update Line
    public void updateLine(int index, int value)
    {
        if (index >= 0 && index < line.length)
        {
            line[index] = value;
        }
    }

    public int[] getLine()
    {
        return line;
    }
}
