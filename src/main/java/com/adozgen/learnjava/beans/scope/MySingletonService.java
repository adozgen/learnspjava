package com.adozgen.learnjava.beans.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class MySingletonService {
}
