package dev.criasltda.javafxsprintstarter.domain.models.base;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Data
@MappedSuperclass
public abstract class BaseModel {
    @UpdateTimestamp
    private Instant updatedAt;
    @CreationTimestamp
    private Instant createdAt;
}
