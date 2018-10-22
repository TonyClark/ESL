package edb.diagrams.basic;

import exp.BoaConstructor;

@BoaConstructor(fields = { "edge", "type", "waypoint" })
public class Attachment {

	public Edge			edge;
	public Attach		type;
	public Waypoint	waypoint;
	
	public Attachment() {}

	public Attachment(Edge edge, Attach type, Waypoint waypoint) {
		super();
		this.edge = edge;
		this.type = type;
		this.waypoint = waypoint;
	}

	public void moveBy(int dx, int dy) {
		waypoint.moveBy(dx, dy);
	}

}
