/**
 * It represents a handler and has two methods: one for handling requests and other for combining handlers
 */
@FunctionalInterface
interface RequestHandler {
    Request handle(Request request);

    default RequestHandler andThen(RequestHandler after) {
        return request -> after.handle(handle(request));
    }
}

    /**
     * Accep