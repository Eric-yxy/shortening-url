package com.wosai.shortUrl.domain;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by ericyang on 2017/11/13.
 */

@Data
@ToString
@MappedSuperclass
public class BasicDomain implements Serializable {
    @Id
    @Column(length = 39)
    @GeneratedValue(generator = "time-based-uuid")
    @GenericGenerator(
            name = "time-based-uuid",
            strategy = "com.wosai.invoice.util.TimeBasedGenerator"
    )
    private String id;

    @CreationTimestamp
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    protected Date ctime = new Date();

    @UpdateTimestamp
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    protected Date mtime = new Date();

    @Version
    protected long version;

    @NotNull
    private boolean deleted = false;
}
