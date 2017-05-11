import java.util.*;


public class Articles
{
	private long id;
	private String title;	
	private long nWords;
	private long nBytes;
	private HashMap<Long, Revision> revisionsHashTable;



	public Articles()
	{
		this.id = 0;
		this.title = "Empty";		
		this.nWords = 0;
		this.nBytes = 0;
		this.revisionsHashTable = new HashMap<Long, Revision>();
	}


	public Articles(long pId, String pTitle, long pNWords, long pNBytes, HashMap<Long, Revision> pRevisionsHashTable)
	{
		this.id = pId;
		this.title = pTitle;
		this.nWords = pNWords;
		this.nBytes = pNBytes;
		this.revisionsHashTable = pRevisionsHashTable;
	}


	public Articles(Articles a)
	{
		this.id = a.getId();
		this.title = a.getTitle();
		this.nWords = a.getNWords();
		this.nBytes = a.getNBytes();
		this.revisionsHashTable = a.getRevisionsHashTable();
	}


	public long getId()										{ return this.id; 					}
	public String getTitle() 								{ return this.title; 				}
	public long getNWords() 								{ return this.nWords; 				}
	public long getNBytes() 								{ return this.nBytes; 				}
	public HashMap<Long, Revision> getRevisionsHashTable() 	{ return this.revisionsHashTable; 	}


	public void setId(long pId)														{ this.id = pId; 					}
    public void setTitle(String pTitle) 											{ this.title = pTitle; 				}
	public void setNWords(long pNWords) 											{ this.nWords = pNWords; 				}
	public void setNBytes(long pNBytes) 											{ this.nBytes = pNBytes; 				}
	public void setRevisionsHashTable(HashMap<Long, Revision> pRevisionsHashTable) 	{ this.revisionsHashTable = pRevisionsHashTable; 	}
}
