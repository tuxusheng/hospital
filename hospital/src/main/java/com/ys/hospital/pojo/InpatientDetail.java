package com.ys.hospital.pojo;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

/**
 * (InpatientDetail)实体类
 *
 * @author yusheng
 * @since 2019-10-10 08:09:39
 */
@Data
public class InpatientDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer inpatientDetailId;
    //每天的住院费
    private Double inpatientDetailPrice;
    //护士对患者的观察建议
    private String inpatientDetailDescription;
    //住院每天的时间
    private Date inpatientDetailDate;
    //所属住院单
    private Integer inpatientId;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getInpatientDetailId() {
        return inpatientDetailId;
    }

    public void setInpatientDetailId(Integer inpatientDetailId) {
        this.inpatientDetailId = inpatientDetailId;
    }

    public Double getInpatientDetailPrice() {
        return inpatientDetailPrice;
    }

    public void setInpatientDetailPrice(Double inpatientDetailPrice) {
        this.inpatientDetailPrice = inpatientDetailPrice;
    }

    public String getInpatientDetailDescription() {
        return inpatientDetailDescription;
    }

    public void setInpatientDetailDescription(String inpatientDetailDescription) {
        this.inpatientDetailDescription = inpatientDetailDescription;
    }

    public Date getInpatientDetailDate() {
        return inpatientDetailDate;
    }

    public void setInpatientDetailDate(Date inpatientDetailDate) {
        this.inpatientDetailDate = inpatientDetailDate;
    }

    public Integer getInpatientId() {
        return inpatientId;
    }

    public void setInpatientId(Integer inpatientId) {
        this.inpatientId = inpatientId;
    }
}