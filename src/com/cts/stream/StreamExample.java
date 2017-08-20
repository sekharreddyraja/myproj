package com.cts.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	// stream is a sequence of elements that support supporting sequential and
	// parallel different kind of operations to
	// perform computations upon those elements(from any source like
	// arrays,Collection,IOs) .it doesnt store any data

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("Raja", "sekhar", "reddy", "naresh");
		list.stream().findFirst().ifPresent(System.out::println); // Calling the method stream() on a list of objects
																	// returns a regular object stream. But we don't
																	// have to create collections in order to work with
																	// streams
		List l = list.stream().filter((s) -> !s.equals("Raja")).collect(Collectors.toList());
		System.out.println(l);
		Stream.of("Raja", "sekhar", "raja").findFirst().ifPresent(System.out::println); // Stream.of() to create a
																						// stream from a bunch of object
																						// references
	
		Stream<String> stream=Stream.of("raja","sekhar","naresh","suresh").filter(s->s.startsWith("s"));
		stream.forEach(System.out::println);
	//	stream.anyMatch(p->true); we will get illigialstateexception
		
		Supplier<Stream<String>> supplierStream=()->Stream.of("raja","ramya","sekhar","ramu").filter(p->p.startsWith("r"));
		supplierStream.get().allMatch(p->true);
		supplierStream.get().noneMatch(p->false);
		supplierStream.get().forEach(System.out::println);
		
	}

}
