import java.util.*;


public class IStruct
{
	private HashMap<Long, Article> articlesHashTable;
	private HashMap<Long, Contributor> contributorHashTable;



	public IStruct()
	{
		this.articlesHashTable = new HashMap<Long, Article>();
		this.contributorHashTable = new HashMap<Long, Contributor>();
	}


	public IStruct(HashMap<Long, Article> pArticlesHashTable, HashMap<Long, Contributor> pContributorHashTable)
	{
		this.articlesHashTable = pArticlesHashTable;
		this.contributorHashTable = pContributorHashTable;
	}


	public IStruct(IStruct i)
	{
		this.articlesHashTable = i.getArticlesHashTable();
		this.contributorHashTable = i.getContributorHashTable();
	}


	public HashMap<Long, Article> getArticlesHashTable() 		{ return this.articlesHashTable; 	}
	public HashMap<Long, Contributor> getContributorHashTable() { return this.contributorHashTable; }

	public void setArticlesHashTable(HashMap<Long, Article> pArticlesHashTable) 			{ this.articlesHashTable = pArticlesHashTable; 			}
	public void setContributorsHashTable(HashMap<Long, Contributor> pContributorHashTable) 	{ this.contributorHashTable = pContributorHashTable; 	}


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
        
        IStruct i = (IStruct) o;
        return this.articlesHashTable.equals(i.getArticlesHashTable())
            && this.contributorHashTable.equals(i.getContributorHashTable());	
    }


    public IStruct clone()
    {
        return new IStruct(this);
    }


    public void insertArticle(Article a)
    {
    	this.articlesHashTable.put(a.getId(), a);
    }


    public boolean searchArticle(Article a)
    {
    	return this.articlesHashTable.containsKey(a.getId());
    }


    public void insertContributor(Contributor c)
    {
    	this.contributorHashTable.put(c.getId(), c);
    }


    public boolean searchContributor(Contributor c)
    {
    	return this.contributorHashTable.containsKey(c.getId());
    } 
}