public class Plot {

    private int x;
    private int y;
    private int width;
    private int depth;

    /**
     * constructor
     */
    public Plot()
    {
        this.x=0;
        this.y=0;
        this.width=1;
        this.depth=1;

    }
    /**
     * A copy constructor
     * @param p, which is a Plot object
     */
    public Plot(Plot p)
    {
       this.x=p.x;
       this.y=p.y;
       this.depth= p.depth;
       this.width=p.width;

    }
    /**
     *
     * @param x
     * @param y
     * @param width
     * @param depth
     */
    public Plot (int x, int y, int width, int depth)
    {
        this.x=x;
        this.y=y;
        this.width=width;
        this.depth=depth;

    }
    /**
     * A method which checks overlapping
     *
     * @param plot
     * @return true or false
     */
    public boolean overlaps(Plot plot)
    {



        if ((plot.y<y+depth)&&(plot.y+plot.depth>y)&&(plot.x<x+width)&&(plot.x+plot.width>x))
        {
            return true;
        }
        return false;

    }

    /**
     * A method which checks encompassing
     *
     * @param plot, a Plot object
     * @return true or false
     */
    public boolean encompasses(Plot plot)
    {

        if ((plot.x >= this.x && plot.x + plot.width <= this.x + this.width) && plot.y >= this.y && plot.y + plot.depth <= this.y+this.depth)
        {
            return true;
        }
        return false;
    }


    /**
     * A setter method for x
     *
     * @param x plot
     */

    public void setX(int x)
    {
        this.x=x;
    }
    /**
     * A setter method for y
     *
     * @param y
     */
    public void setY (int y)
    {
        this.y=y;
    }

    /**
     * A setter method for the width of the property
     *
     * @param width
     */
    public void setWidth(int width)
    {
        this.width=width;
    }

    /**
     * A setter method for the depth of the property
     * @param depth
     */
    public void setDepth(int depth)
    {
        this.depth=depth;
    }

    /**
     * A getter method for x
     *
     * @return x
     */
    public int getX()
    {
        return this.x;
    }

    /**
     * A getter method for y
     * @return y
     */
    public int getY()
    {
        return y;
    }
    /**
     * A getter method for the width
     *
     * @return width
     */
    public int getWidth()
    {
        return width;
    }

    /**
     * A getter method for depth
     * @return depth
     */
    public int getDepth()
    {
        return depth;
    }
    /**
     * A toString method
     *
     */
    public String toString()
    {
        return "Upper left: (" + x + "," + y +"); Width: " +
                width + " Depth: " + depth;
    }
}
