package labfive;

/**
 *
 * @author Allie
 */
public class departments {
    private String name;

    private sections[] mySections;

    //sets

    public void setName(String n)
    {
        name = n;
    } //end method setName

    //gets

    public String getName()
    {
        return name;
    }//end method getName

    public sections[] getMySections()
    {
        return mySections;
    }//end method getMySections

    public void intializeMySections(int size)
    {
        //fills array and initializes sections

        mySections = new sections[size];

        for(int i = 0; i < mySections.length; i++)
        {
            mySections[i] = new sections();
        }


    }//end method initializeMySections

    public void printSections()
    {
        //prints sections

        for(int i = 0; i < mySections.length; i++)
        {

            mySections[i].printSections();

        }//end for

    }//end method printSections

    public void sortMySections()
    {
        //sorts the sections into alphabetical order

        int min = 0;

        for(int i = 0; i < mySections.length; i++)
        {

            min = i;

            for(int j = i + 1; j < mySections.length; j++)
            {

                if(mySections[j].getName().compareTo(mySections[min].getName()) < 0)
                {

                    min = j;

                }//end if

            }//end inner for loop

            sections tempSection = mySections[i];
            mySections[i] = mySections[min];
            mySections[min] = tempSection;

        }//ennd outer for loop

    }//end method sortMySections

}//end class departments
