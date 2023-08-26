package com.vance.ipc2;

// Declare any non-default types here with import statements
import com.vance.ipc2.model.Request;
import com.vance.ipc2.model.Response;

interface IIPCService {

    Response send(in Request request);
}
