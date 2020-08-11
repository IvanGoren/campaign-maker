package com.viru.campaing.maker.model;

import java.util.Map;

import com.viru.campaing.maker.enums.EventTypeEnum;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author ivang
 *
 * Class modeling an event in the story
 *TODO:Determinar donde mierda va el fucking orden
 */

@Getter
@Setter
@NoArgsConstructor
public class CampaignEvent {
	private EventTypeEnum eventType;
	private String mapLocation;
	private String description;
	private Map<Character, String> participants;

	public EventTypeEnum getEventType() {
		return eventType;
	}

	public void setEventType(EventTypeEnum eventType) {
		this.eventType = eventType;
	}

	public String getMapLocation() {
		return mapLocation;
	}

	public void setMapLocation(String mapLocation) {
		this.mapLocation = mapLocation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Map<Character, String> getParticipants() {
		return participants;
	}

	public void setParticipants(Map<Character, String> participants) {
		this.participants = participants;
	}

}
