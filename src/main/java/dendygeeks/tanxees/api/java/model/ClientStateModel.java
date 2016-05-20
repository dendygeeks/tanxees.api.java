package dendygeeks.tanxees.api.java.model;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import com.google.gson.annotations.Expose;

import dendygeeks.tanxees.api.java.interfaces.DebugData;
import dendygeeks.tanxees.api.java.model.PlayerKeysModel;
import dendygeeks.tanxees.utils.GlobalServices;

public class ClientStateModel<DD extends DebugData> {
	@Expose
	private PlayerKeysModel keys;
	
	@Expose
	private DD debugData;
	
	public ClientStateModel(PlayerKeysModel keys, DD debug) {
		this.keys = keys;
		this.debugData = debug;
	}
	
	public PlayerKeysModel getKeys() {
		return keys;
	}
	
	public DD getDebugData() {
		return debugData;
	}
	
	public void setKeys(PlayerKeysModel keys) {
		this.keys = keys;
	}

	public void setDebugData(DD debugData) {
		this.debugData = debugData;
	}

	public static <DD extends DebugData> ClientStateModel<DD> fromJson(Class<DD> debugDataClass, String json) {
		Type parameterizedClientStateModelType = new ParameterizedType() {
		    public Type getRawType() {
		        return ClientStateModel.class;
		    }

		    public Type getOwnerType() {
		        return null;
		    }

		    public Type[] getActualTypeArguments() {
		        return new Type[] { debugDataClass };
		    }
		};
		return GlobalServices.getGson().fromJson(json, parameterizedClientStateModelType);
	}
	public String toJson() {
		return GlobalServices.getGson().toJson(this);
	}
}
