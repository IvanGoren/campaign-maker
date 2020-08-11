package com.viru.campaing.maker.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author ivang
 *
 *         Class for modeling multple characters (N/PCs) in the story
 */
@Getter
@Setter

public class Character {
	
	private String name;
	private String owner;
	private String description;
	private List<CampaignEvent> logbook;

}
