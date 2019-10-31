package nl.base10.bvh.abonnementenCRM.data;

import java.util.List;

import javax.management.relation.RelationType;

import lombok.Data;

@Data
public class Relation {

	String firstName;
	String lastName;
	List<Subscription> subscriptions;
	List<RelationType> relationTypes;
}
