package les_2.task_5;

import java.util.Collections;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class RatingCollector implements Collector<Rating, RatingCollector, SummarizedRating> {

    private int goodRatings;
    private int averageRatings;
    private int badRatings;

    void incrementAverageRating() {
        averageRatings++;
    }

    void incrementGoodRating() {
        goodRatings++;
    }

    void incrementBadRating() {
        badRatings++;
    }

    long size() {
        return averageRatings + goodRatings + badRatings;
    }

    @Override
    public Supplier<RatingCollector> supplier() {
        return RatingCollector::new;
    }

    @Override
    public BiConsumer<RatingCollector, Rating> accumulator() {
        return (groupedRatings, rating) -> {
            final int mark = rating.getMark();
            if (mark >= 4 && mark <= 6) {
                groupedRatings.incrementAverageRating();
            } else if (mark < 4) {
                groupedRatings.incrementBadRating();
            } else {
                groupedRatings.incrementGoodRating();
            }
        };
    }

    @Override
    public Function<RatingCollector, SummarizedRating> finisher() {
        return groupedRatings -> {
            long size = groupedRatings.size();
            double productAverage = groupedRatings.averageRatings / (double) size;
            double productGood = groupedRatings.goodRatings / (double) size;
            double productBad = groupedRatings.badRatings / (double) size;
            return new SummarizedRating(productGood, productAverage, productBad);
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        Set<Characteristics> characteristics = Collections.singleton(Characteristics.UNORDERED);
        return characteristics;
    }

    @Override
    public BinaryOperator<RatingCollector> combiner() {
        return (g, otherG) -> {
            g.averageRatings += otherG.averageRatings;
            g.goodRatings += otherG.goodRatings;
            g.badRatings += otherG.badRatings;
            return g;
        };
    }

}