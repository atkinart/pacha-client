package org.aatkin.pachka.model;

import lombok.Builder;
import lombok.Data;

import java.util.Collection;

@Data
@Builder
public class User {
    private final int id;
    private final String nickname;
    private final String role;
    private final Collection<String> tags;
}
