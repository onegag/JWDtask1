package by.tamkovich.cube.entity;

import java.util.Objects;

public class CubeIterable extends Cube {

    private Long id;

    public CubeIterable(Point center, Double side, Long id) {
        super(center, side);
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        CubeIterable that = (CubeIterable) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
