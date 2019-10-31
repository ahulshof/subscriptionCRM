package nl.base10.bvh.abonnementenCRM.data;

import java.util.Date;

import javax.management.relation.RelationType;

import lombok.Data;

@Data
public class Subscription {

	Date startDate;
	Date endDate;
	String description;
	String code;
	String DoW;
	String startTime;
	RelationType relationType;
	boolean invoiced;
	boolean paid;

}
