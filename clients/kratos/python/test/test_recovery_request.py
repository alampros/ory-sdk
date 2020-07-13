# coding: utf-8

"""
    Ory Kratos

    Welcome to the ORY Kratos HTTP API documentation!  # noqa: E501

    The version of the OpenAPI document: v0.4.6-alpha.1
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest
import datetime

import ory_kratos_client
from ory_kratos_client.models.recovery_request import RecoveryRequest  # noqa: E501
from ory_kratos_client.rest import ApiException

class TestRecoveryRequest(unittest.TestCase):
    """RecoveryRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test RecoveryRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = ory_kratos_client.models.recovery_request.RecoveryRequest()  # noqa: E501
        if include_optional :
            return RecoveryRequest(
                active = '0', 
                expires_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                id = '0', 
                issued_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                messages = [
                    ory_kratos_client.models.message.Message(
                        context = ory_kratos_client.models.context.context(), 
                        id = 56, 
                        text = '0', 
                        type = '0', )
                    ], 
                methods = {
                    'key' : ory_kratos_client.models.recovery_request_method.recoveryRequestMethod(
                        config = ory_kratos_client.models.request_method_config.RequestMethodConfig(
                            action = '0', 
                            fields = [
                                ory_kratos_client.models.form_field.formField(
                                    disabled = True, 
                                    messages = [
                                        ory_kratos_client.models.message.Message(
                                            context = ory_kratos_client.models.context.context(), 
                                            id = 56, 
                                            text = '0', 
                                            type = '0', )
                                        ], 
                                    name = '0', 
                                    pattern = '0', 
                                    required = True, 
                                    type = '0', 
                                    value = ory_kratos_client.models.value.value(), )
                                ], 
                            messages = [
                                ory_kratos_client.models.message.Message(
                                    context = ory_kratos_client.models.context.context(), 
                                    id = 56, 
                                    text = '0', 
                                    type = '0', )
                                ], 
                            method = '0', ), 
                        method = '0', )
                    }, 
                request_url = '0', 
                state = '0'
            )
        else :
            return RecoveryRequest(
                expires_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                id = '0',
                issued_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                methods = {
                    'key' : ory_kratos_client.models.recovery_request_method.recoveryRequestMethod(
                        config = ory_kratos_client.models.request_method_config.RequestMethodConfig(
                            action = '0', 
                            fields = [
                                ory_kratos_client.models.form_field.formField(
                                    disabled = True, 
                                    messages = [
                                        ory_kratos_client.models.message.Message(
                                            context = ory_kratos_client.models.context.context(), 
                                            id = 56, 
                                            text = '0', 
                                            type = '0', )
                                        ], 
                                    name = '0', 
                                    pattern = '0', 
                                    required = True, 
                                    type = '0', 
                                    value = ory_kratos_client.models.value.value(), )
                                ], 
                            messages = [
                                ory_kratos_client.models.message.Message(
                                    context = ory_kratos_client.models.context.context(), 
                                    id = 56, 
                                    text = '0', 
                                    type = '0', )
                                ], 
                            method = '0', ), 
                        method = '0', )
                    },
                request_url = '0',
                state = '0',
        )

    def testRecoveryRequest(self):
        """Test RecoveryRequest"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)


if __name__ == '__main__':
    unittest.main()
