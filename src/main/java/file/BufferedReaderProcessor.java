package file;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
interface BufferedReaderProcessor<T> {
    T process(BufferedReader reader) throws IOException;
}
