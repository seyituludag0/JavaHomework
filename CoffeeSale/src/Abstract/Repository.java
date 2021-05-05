package Abstract;

public interface Repository<T> {
    void add(T entity);
    void update(T entity);
    void delete(T entity);
}
