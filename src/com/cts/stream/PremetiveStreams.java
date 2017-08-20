package com.cts.stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PremetiveStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// IntStream
		IntStream.range(1, 6).forEach(System.out::println);
		int sum = IntStream.range(1, 5).sum();
		System.out.println("sum of elements range 1-5.. " + sum);
		IntStream.of(1, 6, 9).filter(i -> i >= 6).forEach(System.out::print);
		// transform a regular object stream to a primitive stream or vice versa. For
		// that purpose object streams support the special mapping operations
		// mapToInt(), mapToLong() and mapToDouble
		IntStream.range(5, 9).mapToObj(i -> "a" + i).forEach(System.out::println);
		// DoubleStream
		DoubleStream.of(1, 4, 6).forEach(System.out::println);
		DoubleStream.of(3, 6, 10).average().ifPresent(System.out::print);
		// Stream
		Stream.of("a1", "c2").map(s -> s.substring(1)).mapToInt(Integer::parseInt).forEach(System.out::println);
		Stream.of("a1", "c2", "b5").map(s -> s.substring(1)).mapToInt(Integer::parseInt).max()
				.ifPresent(System.out::println);
		Stream.of(1.0, 2.0, 3.0).mapToInt(Double::intValue).mapToObj(i -> "a" + i).forEach(System.out::println);
		// When executing this code snippet, nothing is printed to the console. That is
		// because intermediate operations will only be executed when a terminal
		// operation is present.
		Stream.of(1, 2, 3).filter(s -> {
			System.out.println("filter .."+s);
			return true;
		}).forEach(s->System.out.println("for each..."+s));
	}

}
