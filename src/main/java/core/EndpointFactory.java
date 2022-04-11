package core;

public class EndpointFactory {

	public static Endpoint get(Class<? extends Endpoint> class1) {
		try {
			Endpoint newInstance = class1.newInstance();
			return newInstance;
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}