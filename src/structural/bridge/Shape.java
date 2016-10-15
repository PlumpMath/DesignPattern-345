package structural.bridge;

import java.util.HashMap;
import java.util.Map;

public abstract class Shape{
	protected Map<String, Class<? extends Color>> mapColor;
	
	public Shape(){
		this.mapColor = new HashMap<>();
		this.setNewColor("red", Red.class);
		this.setNewColor("green", Green.class);
	}
	
	public void setNewColor(String id, Class<? extends Color> color){
		this.mapColor.put(id, color);
	}
	
	protected Color getColor(String idColor){
		Color color = null;
		try {
			color = (Color) this.mapColor.get(idColor).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return color;
	}
	
	
	public abstract void applyColor(String idColor);
	
}
