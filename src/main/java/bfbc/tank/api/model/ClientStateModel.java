package bfbc.tank.api.model;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import com.google.gson.annotations.Expose;

import bfbc.tank.api.interfaces.DebugData;
import bfbc.tank.api.model.PlayerKeysModel;
import bfbc.tank.utils.GlobalServices;

public class ClientStateModel<DD extends DebugData> {
	@Expose
	private final PlayerKeysModel keys;
	
	@Expose
	private final DD debugData;

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
