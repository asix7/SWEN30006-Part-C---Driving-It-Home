package group46.sensing;

import java.awt.geom.Point2D.Double;

import com.badlogic.gdx.math.Vector2;
import com.unimelb.swen30006.partc.core.objects.WorldObject;

public interface IMapVelocity {
	
	public Vector2[][] generateVelocityMap(Double refPos, int visibility, float delta, WorldObject [] objectArray);

}
