package ComparatorInterface;

import java.util.Comparator;

public class IdComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.getEmId()- o2.getEmId();
	}

}
