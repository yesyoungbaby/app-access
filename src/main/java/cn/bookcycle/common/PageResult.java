package cn.bookcycle.common;

import java.io.Serializable;
import java.util.List;

/**
 * @author yesyoungbaby
 * @Title: PageResult
 * @ProjectName app-access
 * @Description: 用于分页查询时 返回给前端 包括记录总条数，记录对象列表
 * @date 2018/12/49:18
 */
public class PageResult implements Serializable {
    private long totalNum ;
    private long totalPage;
    private List records;

    public PageResult(){
        super();
    }

    public PageResult(long totalNum, List records) {
        this.totalNum = totalNum;
        this.records = records;
    }

    public long getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(long totalNum) {
        this.totalNum = totalNum;
    }

    public List getRecords() {
        return records;
    }

    public void setRecords(List records) {
        this.records = records;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "totalNum=" + totalNum +
                ", totalPage=" + totalPage +
                ", records=" + records +
                '}';
    }
}
