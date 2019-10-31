package nl.base10.bvh.abonnementenCRM.data;

import java.util.List;

import lombok.Data;

@Data
public class Organization {
	String name;
	List<Relation> members;
	List<Relation> board;

}
