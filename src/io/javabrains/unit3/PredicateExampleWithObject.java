package io.javabrains.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import io.javabrains.common.Hosting;
import io.javabrains.common.HostingRepository;

public class PredicateExampleWithObject {

	public static void main(String[] args) {
		Hosting h1 = new Hosting(1, "Amazon", "aws.amazon.com");
		Hosting h2 = new Hosting(2, "Linode", "linode.com");
		Hosting h3 = new Hosting(3, "Liquidweb", "liquidweb.com");
		Hosting h4 = new Hosting(4, "Google", "google.com");

		List<Hosting> listHosting = Arrays.asList(new Hosting[] { h1, h2, h3, h4 });
		List<Hosting> result = HostingRepository.filterHosting(listHosting, X -> X.getName().startsWith("G"));
		// List<Hosting> result1 = listHosting.stream().filter(x ->
		// x.getName().startsWith("G")).collect(Collectors.toList());
		System.out.println(result);
		List<Hosting> result2 = HostingRepository.filterHosting(listHosting, isDeveloperFriendly());
		System.out.println(result2);
		
	}
public static Predicate<Hosting> isDeveloperFriendly(){
	return n -> n.getName().equals("Linode");
}
}

