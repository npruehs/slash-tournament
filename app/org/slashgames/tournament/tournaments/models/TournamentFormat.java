package org.slashgames.tournament.tournaments.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
public class TournamentFormat extends Model {
	@Id
	@Constraints.Required
	@Formats.NonEmpty
	public String name;

	@Column(length = 10000)
	public String rules;
}
