package StudentTest;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Manpower {
	List addressList;
	Set addressSet;
	Map addressMap;
	Properties addressProp;
	public List getAddressList() {
		return addressList;
	}
	public void setAddressList(List addressList) {
		System.out.print("su thay");
		this.addressList = addressList;
	}
	public Set getAddressSet() {
		return addressSet;
	}
	public void setAddressSet(Set addressSet) {
		System.out.print("su thay");
		this.addressSet = addressSet;
	}
	public Map getAddressMap() {
		return addressMap;
	}
	public void setAddressMap(Map addressMap) {
		System.out.print("su thay");
		this.addressMap = addressMap;
	}
	public Properties getAddressProp() {
		return addressProp;
	}
	public void setAddressProp(Properties addressProp) {
		System.out.print("su thay");
		this.addressProp = addressProp;
	}
	@Override
	public String toString() {
		return "Manpower [addressList=" + addressList + ", addressSet=" + addressSet + ", addressMap=" + addressMap
				+ ", addressProp=" + addressProp + "]";
	}
}
