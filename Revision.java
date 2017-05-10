import java.util.*;


public class Revision
{
	private long id;
	private long nRevisions;
	private String timestamp;



	public Revision()
	{
		this.id = 0;
		this.nRevisions = 0;
		this.timestamp = "Empty";
	}


	public Revision(long pId, long pNRevisions, String pTimestamp)
	{
		this.id = pId;
		this.nRevisions = nRevisions;
		this.timestamp = timestamp;
	}


	public Revision(Revision r)
	{
		this.id = r.getId();
		this.nRevisions = r.getNRevisions();
		this.timestamp = r.getTimestamp();
	}


	public long getId()				{ return this.id; 			}
	public long getNRevisions() 	{ return this.nRevisions; 	}
	public String getTimestamp() 	{ return this.timestamp; 	}

	public void setId(long pId)					{ this.id = pId; 					}
	public void setNRevisions(long pNRevisions) { this.nRevisions = pNRevisions; 	}
	public void setTimestamp(String pTimestamp) { this.timestamp = pTimestamp; 		} 	
}