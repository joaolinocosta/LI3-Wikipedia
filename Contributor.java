import java.util.*;


public class Contributor
{
	private long id;
	private long nContributions;
	private String contributorName;



	public Contributor()
	{
		this.id = 0;
		this.nContributions = 0;
		this.contributorName = "Empty";
	}


	public Contributor(long pId, long pNContributions, String pContributorName)
	{
		this.id = pId;
		this.nContributions = pNContributions;
		this.contributorName = pContributorName;
	}


	public Contributor(Contributor c)
	{
		this.id = c.getId();
		this.nContributions = c.getNContributions();
		this.contributorName = c.getContributorName();
	}


	public long getId()					{ return this.id; 			}
	public long getNContributions() 	{ return this.nContributions; 	}
	public String getContributorName() 	{ return this.contributorName; 	}

	public void setId(long pId)									{ this.id = pId; 							}
	public void setNContributions(long pNContributions) 		{ this.nContributions = pNContributions; 	}
	public void setContributorName(String pContributorName) 	{ this.contributorName = pContributorName; 	}


	public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        } 
        
        if (o == null) {
            return false;
        }
        
        if (getClass() != o.getClass()) {
            return false;
        }
        
        Contributor c = (Contributor) o;
        return this.id.equals(c.getId())
            && this.nContributions.equals(c.getNContributions())
            && this.contributorName.equals(c.getContributorName());
    }


    public Contributor clone()
    {
        return new Contributor(this);
    }	
}