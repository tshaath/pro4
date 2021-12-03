public class ManagementCompany
{
    private final int MAX_PROPERTY = 5;
    private double mgmFeePer;
    private String name;
    private Property[] properties;
    private String taxID;
    private final int MGMT_WIDTH = 10;
    private final int MGMT_DEPTH = 10;
    private Plot plot;
    private int index = 0;

    /**
     * A default constructor which sets things to null
     */
    public ManagementCompany() {
        name = "";
        taxID = "";
        plot = new Plot();
        properties = new Property[MAX_PROPERTY];
    }

    /**
     *
     * @param name
     * @param taxID
     * @param mgmFeePer
     */

    public ManagementCompany(String name, String taxID, double mgmFeePer) {
        this.name = name;
        this.taxID = taxID;
        this.mgmFeePer = mgmFeePer;
        plot = new Plot();
        properties = new Property[MAX_PROPERTY];
    }
    /**
     *
     * @param name
     * @param taxID
     * @param mgmFeePer
     * @param x
     * @param y
     * @param width
     * @param depth
     */
    public ManagementCompany(String name, String taxID, double mgmFeePer, int x, int y, int depth, int width) {
        this.name = name;
        this.taxID = taxID;
        this.mgmFeePer = mgmFeePer;
        this.plot = new Plot(x, y, width, depth);
        properties = new Property[MAX_PROPERTY];
    }
    /**
     * A copy constructor
     * @param otherCompany
     */
    public ManagementCompany(ManagementCompany otherCompany) {
        this.name = otherCompany.name;
        this.taxID = otherCompany.taxID;
        this.mgmFeePer = otherCompany.mgmFeePer;
        this.plot = new Plot(otherCompany.plot);
        properties = new Property[MAX_PROPERTY];
    }

    /**
     * a getter method for the
     * @return MAX_PROPERTY
     */
    public int getMAX_PROPERTY() {

        return MAX_PROPERTY;
    }

    /**
     *
     * @param property
     * @return either -1 if the array is full, -2 if property is null,
     *  -3 if the plot is not contained by the MgmtCo plot,
     *  -4 of the plot overlaps any other property, or the index in
     *  the array where the property was added successfully.
     */
    public int addProperty(Property property) {
//        properties[index] = property;
//        index++;
//
        if (index >= MAX_PROPERTY)
            return -1;

        else if (property == null)
            return -2;

        else if ((plot.encompasses(property.getPlot())))
            return -3;

        for (int i = 0; i < index; i++) {
            if (properties[i].getPlot().overlaps(property.getPlot()))
                return -4;

        }

        properties[index] = property;
        index++;
        return index-1;
    }

    /**
     * A method that adds a new property
     *
     * @param name
     * @param city
     * @param rent
     * @param owner
     * @return addProperty(property)
     */
    public int addProperty(String name, String city, double rent, String owner)
    {
        Property property = new Property(name,city ,rent,owner);
        return addProperty(property);
    }
    /**
     * A method that adds a property
     *
     * @param name
     * @param city
     * @param rent
     * @param owner
     * @param x
     * @param y
     * @param width
     * @param depth
     * @return addProperty(property)
     */
    public int addProperty(String name,String city,double rent,
                           String owner,int x,int y,int width,int depth)
    {
        //String propertyName, String city, double rentAmount,String owner
        Property property= new Property(name, city, rent, owner, x,  y, depth, width);
        return addProperty(property);
    }
    /**
     * A method that calculates the total rent
     *
     * @return totalRent
     */
    public double totalRent()
    {
        double total= 0;
        for (int i=0; i<index; i++)
        {
            total+=properties[i].getRentAmount();
        }
        return total;
    }
    /**
     * A method that calculates the maximum property rent
     *
     * @return maximum rent
     */
    public String maxRentProp()
    {
        return properties[maxRentPropertyIndex()].toString();
    }

    /**
     * A method that gets the index of the maximum rent
     *
     * @return index of the maximum rent
     */

    public int maxRentPropertyIndex()
    {
        double maxRent=properties[0].getRentAmount();

        int arrayIndex=0;

        for (int i=1; i<index;i++ )
        {
            if (maxRent<properties[i].getRentAmount())
            {
                maxRent = properties[i].getRentAmount();

                arrayIndex=i;
            }
        }
        return arrayIndex;

    }

    /**
     * A method that displays the property
     *
     * @param i
     * @return properties[i]
     */
    public String displayPropertyAtIndex(int i)
    {
        String str=properties[i].toString();

        return str;
    }


    /**
     * toString method
     *
     */
    public String toString()
    {
        double totalRent=totalRent();
        String str="";
        str+="List of the properties for "+name+"taxID: "+taxID+"\n";
        str+="__________________________________________________________\n";
        for(int i=0; i<index;i++)
        {
         str=properties[i].toString();
        }
        str+="__________________________________________________________\n";
        str+="total management Fee:"+(totalRent * mgmFeePer) / 100;
        return str;
    }
    /**
     * a getter method for the owner's name
     * @return name
     */
    public String getName()
    {
        return name;
    }

    /**
     * a getter method for plot
     *
     * @return plot
     */
    public Plot getPlot()
    {
        return plot;
    }

}