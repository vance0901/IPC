package com.vance.ipc;

// Declare any non-default types here with import statements
import com.vance.ipc.model.Request;
import com.vance.ipc.model.Response;
interface IIPCService {

    Response send(in Request request);
}
