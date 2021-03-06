package observer2;

import java.util.ArrayList;
import java.util.List;

public class Secretary implements Subject{
	private List<Observer>	observers	= new ArrayList<Observer>();
	private String			action;

	public void attach(Observer observer)
	{
		observers.add(observer);
	}

	public void detach(Observer observer)
	{
		observers.remove(observer);
	}

	public void announce()
	{
		for (Observer obj : observers)
		{
			obj.update();
		}
	}

	public String getAction()
	{
		return action;
	}

	public void setAction(String action)
	{
		this.action = action;
	}
}
