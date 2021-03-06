package org.slashgames.tournament.tournaments.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
public class Game extends Model {
	@Id
	@Constraints.Required
	@Formats.NonEmpty
	public String name;
	
	/**
     * @deprecated
     * 		Specify game rules by adding GameRules objects instead.
     */
	@Deprecated
	@Column(length = 10000)
	public String rules;
	
	public String icon;
}
