package com.tenduke.events.api.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tenduke.events.api.model.data.ErrorInfoFields;
import com.tenduke.events.api.model.data.OldUserNameFields;
import com.tenduke.events.api.model.data.RequestFields;
import com.tenduke.events.api.model.data.TimeFields;
import com.tenduke.events.api.model.data.UserIdFields;

/**
 * User email changed.
 * @author roope
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface UserEmailChanged extends
        TimeFields,
        RequestFields,
        ErrorInfoFields,
        UserIdFields,
        OldUserNameFields {
}
