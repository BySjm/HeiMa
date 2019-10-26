package cn.bysjm.domain;

public class QueryVo<E> {
    private String ename;
    private String address;
    private Integer currentPage;
    private Integer pageSize;
    private Integer index;

    public QueryVo() {
    }

    public QueryVo(String ename, String address, Integer currentPage, Integer pageSize) {
        this.ename = ename;
        this.address = address;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "QueryVo{" +
                "ename='" + ename + '\'' +
                ", address='" + address + '\'' +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", index=" + index +
                '}';
    }
}
