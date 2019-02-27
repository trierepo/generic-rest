package org.tt.genericrest.model;

public class PlaceModel {

	private String place;
	private Long id;

	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "PlaceModel [place=" + place + ", id=" + id + "]";
	}
}
