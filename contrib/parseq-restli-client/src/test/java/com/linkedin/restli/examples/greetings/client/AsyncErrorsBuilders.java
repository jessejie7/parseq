
package com.linkedin.restli.examples.greetings.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import javax.annotation.Generated;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.DynamicRecordMetadata;
import com.linkedin.data.template.FieldDef;
import com.linkedin.restli.client.OptionsRequestBuilder;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.ResourceSpecImpl;
import com.linkedin.restli.examples.greetings.api.Greeting;
import com.linkedin.restli.internal.common.URIParamUtils;


/**
 * generated from: com.linkedin.restli.examples.greetings.server.AsyncErrorResource
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder. Generated from /Users/jodzga/dev/pegasus_trunk/pegasus/restli-int-test-api/src/main/idl/com.linkedin.restli.examples.greetings.client.asyncErrors.restspec.json.", date = "Thu Mar 31 14:16:20 PDT 2016")
public class AsyncErrorsBuilders {

    private final java.lang.String _baseUriTemplate;
    private RestliRequestOptions _requestOptions;
    private final static java.lang.String ORIGINAL_RESOURCE_PATH = "asyncErrors";
    private final static ResourceSpec _resourceSpec;

    static {
        HashMap<java.lang.String, DynamicRecordMetadata> requestMetadataMap = new HashMap<java.lang.String, DynamicRecordMetadata>();
        ArrayList<FieldDef<?>> callbackParams = new ArrayList<FieldDef<?>>();
        callbackParams.add(new FieldDef<java.lang.String>("id", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        requestMetadataMap.put("callback", new DynamicRecordMetadata("callback", callbackParams));
        ArrayList<FieldDef<?>> promiseParams = new ArrayList<FieldDef<?>>();
        promiseParams.add(new FieldDef<java.lang.String>("id", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        requestMetadataMap.put("promise", new DynamicRecordMetadata("promise", promiseParams));
        ArrayList<FieldDef<?>> taskParams = new ArrayList<FieldDef<?>>();
        taskParams.add(new FieldDef<java.lang.String>("id", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        requestMetadataMap.put("task", new DynamicRecordMetadata("task", taskParams));
        HashMap<java.lang.String, DynamicRecordMetadata> responseMetadataMap = new HashMap<java.lang.String, DynamicRecordMetadata>();
        responseMetadataMap.put("callback", new DynamicRecordMetadata("callback", Collections.singletonList(new FieldDef<Greeting>("value", Greeting.class, DataTemplateUtil.getSchema(Greeting.class)))));
        responseMetadataMap.put("promise", new DynamicRecordMetadata("promise", Collections.singletonList(new FieldDef<Greeting>("value", Greeting.class, DataTemplateUtil.getSchema(Greeting.class)))));
        responseMetadataMap.put("task", new DynamicRecordMetadata("task", Collections.singletonList(new FieldDef<Greeting>("value", Greeting.class, DataTemplateUtil.getSchema(Greeting.class)))));
        _resourceSpec = new ResourceSpecImpl(EnumSet.noneOf(ResourceMethod.class), requestMetadataMap, responseMetadataMap, Void.class, null, null, null, Collections.<String, Class<?>>emptyMap());
    }

    public AsyncErrorsBuilders() {
        this(RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public AsyncErrorsBuilders(RestliRequestOptions requestOptions) {
        _baseUriTemplate = ORIGINAL_RESOURCE_PATH;
        _requestOptions = assignRequestOptions(requestOptions);
    }

    public AsyncErrorsBuilders(java.lang.String primaryResourceName) {
        this(primaryResourceName, RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public AsyncErrorsBuilders(java.lang.String primaryResourceName, RestliRequestOptions requestOptions) {
        _baseUriTemplate = primaryResourceName;
        _requestOptions = assignRequestOptions(requestOptions);
    }

    private java.lang.String getBaseUriTemplate() {
        return _baseUriTemplate;
    }

    public RestliRequestOptions getRequestOptions() {
        return _requestOptions;
    }

    public java.lang.String[] getPathComponents() {
        return URIParamUtils.extractPathComponentsFromUriTemplate(_baseUriTemplate);
    }

    private static RestliRequestOptions assignRequestOptions(RestliRequestOptions requestOptions) {
        if (requestOptions == null) {
            return RestliRequestOptions.DEFAULT_OPTIONS;
        } else {
            return requestOptions;
        }
    }

    public static java.lang.String getPrimaryResource() {
        return ORIGINAL_RESOURCE_PATH;
    }

    public OptionsRequestBuilder options() {
        return new OptionsRequestBuilder(getBaseUriTemplate(), getRequestOptions());
    }

    public AsyncErrorsDoCallbackBuilder actionCallback() {
        return new AsyncErrorsDoCallbackBuilder(getBaseUriTemplate(), Greeting.class, _resourceSpec, getRequestOptions());
    }

    public AsyncErrorsDoPromiseBuilder actionPromise() {
        return new AsyncErrorsDoPromiseBuilder(getBaseUriTemplate(), Greeting.class, _resourceSpec, getRequestOptions());
    }

    public AsyncErrorsDoTaskBuilder actionTask() {
        return new AsyncErrorsDoTaskBuilder(getBaseUriTemplate(), Greeting.class, _resourceSpec, getRequestOptions());
    }

}
