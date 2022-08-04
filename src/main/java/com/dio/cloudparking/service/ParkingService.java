package com.dio.cloudparking.service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.dio.cloudparking.model.Parking;

@Service
public class ParkingService {
	
	private static Map<String, Parking> parkingMap = new HashMap<>();
	
	static {
		var id = getUUID();
		var id1 = getUUID();
		Parking parking = new Parking(id, "EWV-0125", "SP", "VW", "Blue", null, null, null);
		Parking parking1 = new Parking(id1, "EWV-2345", "MG", "Ford", "Green", null, null, null);
		parkingMap.put(id, parking);
		parkingMap.put(id1, parking1);
	}
	
	public List<Parking> findAll(){
		return parkingMap.values().stream().collect(Collectors.toList());
	}

	private static String getUUID() {		
		return UUID.randomUUID().toString().replace("-", "");
	}

	public Parking findById(String id) {		
		return parkingMap.get(id);
	}
	
	public Parking create(Parking parkingCreate) {
		String uuid = getUUID();
		parkingCreate.setId(getUUID());
		parkingCreate.setEntryDate(LocalDateTime.now());
		parkingMap.put(uuid, parkingCreate);
		return parkingCreate;
	}

}
