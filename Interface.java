import java.util.*;


public class Interface
{
	private IStruct data;



	public Interface()
	{
		this.data = new IStruct();
	}


	public Interface(IStruct pData)
	{
		this.data = pData;
	}


	public Interface(Interface i)
	{
		this.data = i.getData();
	}


	public IStruct getData() { return this.data; }

	public IStruct setData(IStruct pData) {this.data = pData; }


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
        
        Interface i = (Interface) o;
        return this.data.equals(i.getData);
    }


    public Interface clone()
    {
        return new Interface(this);
    }


    public IStruct load(IStruct qs, int nSnaps, String[] snapPaths)
    {

    }


    public long uniqueArticles(IStruct qs)
    {

    	return (long) qs.size();
    }	
}