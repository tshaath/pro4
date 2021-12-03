public class Property {

    private String city;
    private String owner;
    private String propertyName;
    private double rentAmount;
    private Plot plot;
    /**
     * A constructor for empty values
     *
     */
    public Property(Property[] properties)
    {
        city="";
        owner="";
        propertyName="";
        rentAmount=0;
        plot=new Plot();

    }
    /**
     * A copy constructor
     *
     */
    public Property(Property p)
    {
        this.city=p.city;
        this.owner=p.owner;
        this.propertyName=p.propertyName;
        this.rentAmount=p.rentAmount;
        this.plot=new Plot(p.plot);
    }
    /**
     *
     * parametrized constructor
     * @param propertyName
     * @param city
     * @param rentAmount
     * @param owner
     */
    public Property(String propertyName, String city, double rentAmount,String owner)
    {
        this.city=city;
        this.owner=owner;
        this.propertyName=propertyName;
        this.rentAmount=rentAmount;

    }

    /**
     *
     * @param propertyName
     * @param city
     * @param rentAmount
     * @param owner
     * @param x
     * @param y
     * @param width
     * @param depth
     */
    public Property(String propertyName, String city, double rentAmount,String owner, int x
    , int y, int depth, int width)
    {
        this.city=city;
        this.owner=owner;
        this.propertyName=propertyName;
        this.rentAmount=rentAmount;
        this.plot=new Plot(x, y, width, depth);

    }

    /**
     * a getter method for the name of the property
     *
     * @return the name of the property
     */
    public String getPropertyName()
    {
        return propertyName;
    }

    /**
     * a setter method for the name of the property
     *
     * @param propertyName
     */
    public void setPropertyName(String propertyName)
    {
        this.propertyName=propertyName;
    }


    /**
     * A getter method for the name of the city
     *
     * @return the name of the city
     */
    public String getCity()
    {
        return city;
    }

    /**
     * a getter method plot
     *
     * @return the plot
     */
    public Plot getPlot()
    {
        return plot;

    }

    /**
     * A setter method for the plot
     *
     * @param x
     * @param y
     * @param width
     * @param depth
     */
    public Plot setPlot(int x, int y, int width, int depth)
    {
        return this.plot=new Plot(x, y, width, depth);
    }
    /**
     * A setter method for the name of the city
     *
     * @param city
     */
    public void setCity(String city)
    {
        this.city=city;
    }

    /**
     * a getter method for the amount of rent
     *
     * @return amount of rent
     */
    public double getRentAmount()
    {
        return rentAmount;
    }

    /**
     * a setter method for the amount of rent
     *
     * @param rentAmount
     */
    public void setRentAmount(double rentAmount)
    {
        this.rentAmount=rentAmount;
    }

    /**
     * a getter method for the name of the owner
     *
     * @return the name of the owner
     */
    public String getOwner()
    {
        return owner;
    }

    /**
     * a setter method for the name of the owner
     *
     * @param owner
     */
    public void setOwner(String owner)
    {
        this.owner=owner;

    }

    /**
     * A toString method that returns the property name
     * ,the city, the name of the owner, and the rent amount
     *
     */
    public String toString()
    {
        String str="Property Name: " + propertyName + "\n" +
                "Located in " + city + "\n" +
                "Belonging to: " + owner + "\n" +
                "Rent Amount: " + rentAmount + "\n" + "\n";
        return str;
    }
}

