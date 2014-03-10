union LogID {
    1: i64 log_id;
}

union LogPropertyValue {
    1: string message;
    2: optional string correlationId;
}

struct LogProperty {
    1: required LogID id;
    2: required LogPropertyValue property;
}

union ProcessID {
    1: i32 process_id;
}

union ProcessPropertyValue {
    1: string name;
    2: string environment;
}

struct ProcessProperty {
    1: required ProcessID id;
    2: required ProcessPropertyValue property;
}

struct LogEdge {
    1: required LogID log;
    2: required ProcessID process;
    3: required i64 nonce;
}