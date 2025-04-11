package it.auties.whatsapp.model.message.model;

import it.auties.whatsapp.model.message.model.MessageContainer;
import it.auties.protobuf.stream.ProtobufInputStream;
import it.auties.protobuf.stream.ProtobufOutputStream;
import it.auties.protobuf.model.ProtobufWireType;

public class MessageContainerSpec {
    public static byte[] encode(MessageContainer protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        var stream = ProtobufOutputStream.toBytes(sizeOf(protoInputObject));
        encode(protoInputObject, stream);
        return stream.toOutput();
    }

    public static void encode(MessageContainer protoInputObject, ProtobufOutputStream protoOutputStream) {
        if (protoInputObject == null) {
            return;
        }
        var textWithNoContextMessage = protoInputObject.textWithNoContextMessage();
        if (textWithNoContextMessage != null) {
            var textWithNoContextMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(textWithNoContextMessage);
            if (textWithNoContextMessage0 != null) {
                var textWithNoContextMessage1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(textWithNoContextMessage0);
                if (textWithNoContextMessage1 != null) {
                    protoOutputStream.writeString(1, textWithNoContextMessage1);
                }
            }
        }
        var senderKeyDistributionMessage = protoInputObject.senderKeyDistributionMessage();
        if (senderKeyDistributionMessage != null) {
            var senderKeyDistributionMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(senderKeyDistributionMessage);
            if (senderKeyDistributionMessage0 != null) {
                protoOutputStream.writeMessage(2, it.auties.whatsapp.model.message.server.SenderKeyDistributionMessageSpec.sizeOf(senderKeyDistributionMessage0));
                it.auties.whatsapp.model.message.server.SenderKeyDistributionMessageSpec.encode(senderKeyDistributionMessage0, protoOutputStream);
            }
        }
        var imageMessage = protoInputObject.imageMessage();
        if (imageMessage != null) {
            var imageMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(imageMessage);
            if (imageMessage0 != null) {
                protoOutputStream.writeMessage(3, it.auties.whatsapp.model.message.standard.ImageMessageSpec.sizeOf(imageMessage0));
                it.auties.whatsapp.model.message.standard.ImageMessageSpec.encode(imageMessage0, protoOutputStream);
            }
        }
        var contactMessage = protoInputObject.contactMessage();
        if (contactMessage != null) {
            var contactMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contactMessage);
            if (contactMessage0 != null) {
                protoOutputStream.writeMessage(4, it.auties.whatsapp.model.message.standard.ContactMessageSpec.sizeOf(contactMessage0));
                it.auties.whatsapp.model.message.standard.ContactMessageSpec.encode(contactMessage0, protoOutputStream);
            }
        }
        var locationMessage = protoInputObject.locationMessage();
        if (locationMessage != null) {
            var locationMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(locationMessage);
            if (locationMessage0 != null) {
                protoOutputStream.writeMessage(5, it.auties.whatsapp.model.message.standard.LocationMessageSpec.sizeOf(locationMessage0));
                it.auties.whatsapp.model.message.standard.LocationMessageSpec.encode(locationMessage0, protoOutputStream);
            }
        }
        var textMessage = protoInputObject.textMessage();
        if (textMessage != null) {
            var textMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(textMessage);
            if (textMessage0 != null) {
                protoOutputStream.writeMessage(6, it.auties.whatsapp.model.message.standard.TextMessageSpec.sizeOf(textMessage0));
                it.auties.whatsapp.model.message.standard.TextMessageSpec.encode(textMessage0, protoOutputStream);
            }
        }
        var documentMessage = protoInputObject.documentMessage();
        if (documentMessage != null) {
            var documentMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(documentMessage);
            if (documentMessage0 != null) {
                protoOutputStream.writeMessage(7, it.auties.whatsapp.model.message.standard.DocumentMessageSpec.sizeOf(documentMessage0));
                it.auties.whatsapp.model.message.standard.DocumentMessageSpec.encode(documentMessage0, protoOutputStream);
            }
        }
        var audioMessage = protoInputObject.audioMessage();
        if (audioMessage != null) {
            var audioMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(audioMessage);
            if (audioMessage0 != null) {
                protoOutputStream.writeMessage(8, it.auties.whatsapp.model.message.standard.AudioMessageSpec.sizeOf(audioMessage0));
                it.auties.whatsapp.model.message.standard.AudioMessageSpec.encode(audioMessage0, protoOutputStream);
            }
        }
        var videoMessage = protoInputObject.videoMessage();
        if (videoMessage != null) {
            var videoMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(videoMessage);
            if (videoMessage0 != null) {
                protoOutputStream.writeMessage(9, it.auties.whatsapp.model.message.standard.VideoOrGifMessageSpec.sizeOf(videoMessage0));
                it.auties.whatsapp.model.message.standard.VideoOrGifMessageSpec.encode(videoMessage0, protoOutputStream);
            }
        }
        var callMessage = protoInputObject.callMessage();
        if (callMessage != null) {
            var callMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(callMessage);
            if (callMessage0 != null) {
                protoOutputStream.writeMessage(10, it.auties.whatsapp.model.message.standard.CallMessageSpec.sizeOf(callMessage0));
                it.auties.whatsapp.model.message.standard.CallMessageSpec.encode(callMessage0, protoOutputStream);
            }
        }
        var protocolMessage = protoInputObject.protocolMessage();
        if (protocolMessage != null) {
            var protocolMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(protocolMessage);
            if (protocolMessage0 != null) {
                protoOutputStream.writeMessage(12, it.auties.whatsapp.model.message.server.ProtocolMessageSpec.sizeOf(protocolMessage0));
                it.auties.whatsapp.model.message.server.ProtocolMessageSpec.encode(protocolMessage0, protoOutputStream);
            }
        }
        var contactsArrayMessage = protoInputObject.contactsArrayMessage();
        if (contactsArrayMessage != null) {
            var contactsArrayMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contactsArrayMessage);
            if (contactsArrayMessage0 != null) {
                protoOutputStream.writeMessage(13, it.auties.whatsapp.model.message.standard.ContactsMessageSpec.sizeOf(contactsArrayMessage0));
                it.auties.whatsapp.model.message.standard.ContactsMessageSpec.encode(contactsArrayMessage0, protoOutputStream);
            }
        }
        var highlyStructuredMessage = protoInputObject.highlyStructuredMessage();
        if (highlyStructuredMessage != null) {
            var highlyStructuredMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(highlyStructuredMessage);
            if (highlyStructuredMessage0 != null) {
                protoOutputStream.writeMessage(14, it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.sizeOf(highlyStructuredMessage0));
                it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.encode(highlyStructuredMessage0, protoOutputStream);
            }
        }
        var sendPaymentMessage = protoInputObject.sendPaymentMessage();
        if (sendPaymentMessage != null) {
            var sendPaymentMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(sendPaymentMessage);
            if (sendPaymentMessage0 != null) {
                protoOutputStream.writeMessage(16, it.auties.whatsapp.model.message.payment.SendPaymentMessageSpec.sizeOf(sendPaymentMessage0));
                it.auties.whatsapp.model.message.payment.SendPaymentMessageSpec.encode(sendPaymentMessage0, protoOutputStream);
            }
        }
        var liveLocationMessage = protoInputObject.liveLocationMessage();
        if (liveLocationMessage != null) {
            var liveLocationMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(liveLocationMessage);
            if (liveLocationMessage0 != null) {
                protoOutputStream.writeMessage(18, it.auties.whatsapp.model.message.standard.LiveLocationMessageSpec.sizeOf(liveLocationMessage0));
                it.auties.whatsapp.model.message.standard.LiveLocationMessageSpec.encode(liveLocationMessage0, protoOutputStream);
            }
        }
        var requestPaymentMessage = protoInputObject.requestPaymentMessage();
        if (requestPaymentMessage != null) {
            var requestPaymentMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(requestPaymentMessage);
            if (requestPaymentMessage0 != null) {
                protoOutputStream.writeMessage(22, it.auties.whatsapp.model.message.payment.RequestPaymentMessageSpec.sizeOf(requestPaymentMessage0));
                it.auties.whatsapp.model.message.payment.RequestPaymentMessageSpec.encode(requestPaymentMessage0, protoOutputStream);
            }
        }
        var declinePaymentRequestMessage = protoInputObject.declinePaymentRequestMessage();
        if (declinePaymentRequestMessage != null) {
            var declinePaymentRequestMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(declinePaymentRequestMessage);
            if (declinePaymentRequestMessage0 != null) {
                protoOutputStream.writeMessage(23, it.auties.whatsapp.model.message.payment.DeclinePaymentRequestMessageSpec.sizeOf(declinePaymentRequestMessage0));
                it.auties.whatsapp.model.message.payment.DeclinePaymentRequestMessageSpec.encode(declinePaymentRequestMessage0, protoOutputStream);
            }
        }
        var cancelPaymentRequestMessage = protoInputObject.cancelPaymentRequestMessage();
        if (cancelPaymentRequestMessage != null) {
            var cancelPaymentRequestMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(cancelPaymentRequestMessage);
            if (cancelPaymentRequestMessage0 != null) {
                protoOutputStream.writeMessage(24, it.auties.whatsapp.model.message.payment.CancelPaymentRequestMessageSpec.sizeOf(cancelPaymentRequestMessage0));
                it.auties.whatsapp.model.message.payment.CancelPaymentRequestMessageSpec.encode(cancelPaymentRequestMessage0, protoOutputStream);
            }
        }
        var templateMessage = protoInputObject.templateMessage();
        if (templateMessage != null) {
            var templateMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(templateMessage);
            if (templateMessage0 != null) {
                protoOutputStream.writeMessage(25, it.auties.whatsapp.model.message.button.TemplateMessageSpec.sizeOf(templateMessage0));
                it.auties.whatsapp.model.message.button.TemplateMessageSpec.encode(templateMessage0, protoOutputStream);
            }
        }
        var stickerMessage = protoInputObject.stickerMessage();
        if (stickerMessage != null) {
            var stickerMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(stickerMessage);
            if (stickerMessage0 != null) {
                protoOutputStream.writeMessage(26, it.auties.whatsapp.model.message.standard.StickerMessageSpec.sizeOf(stickerMessage0));
                it.auties.whatsapp.model.message.standard.StickerMessageSpec.encode(stickerMessage0, protoOutputStream);
            }
        }
        var groupInviteMessage = protoInputObject.groupInviteMessage();
        if (groupInviteMessage != null) {
            var groupInviteMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(groupInviteMessage);
            if (groupInviteMessage0 != null) {
                protoOutputStream.writeMessage(28, it.auties.whatsapp.model.message.standard.GroupInviteMessageSpec.sizeOf(groupInviteMessage0));
                it.auties.whatsapp.model.message.standard.GroupInviteMessageSpec.encode(groupInviteMessage0, protoOutputStream);
            }
        }
        var templateReplyMessage = protoInputObject.templateReplyMessage();
        if (templateReplyMessage != null) {
            var templateReplyMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(templateReplyMessage);
            if (templateReplyMessage0 != null) {
                protoOutputStream.writeMessage(29, it.auties.whatsapp.model.message.button.TemplateReplyMessageSpec.sizeOf(templateReplyMessage0));
                it.auties.whatsapp.model.message.button.TemplateReplyMessageSpec.encode(templateReplyMessage0, protoOutputStream);
            }
        }
        var productMessage = protoInputObject.productMessage();
        if (productMessage != null) {
            var productMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(productMessage);
            if (productMessage0 != null) {
                protoOutputStream.writeMessage(30, it.auties.whatsapp.model.message.standard.ProductMessageSpec.sizeOf(productMessage0));
                it.auties.whatsapp.model.message.standard.ProductMessageSpec.encode(productMessage0, protoOutputStream);
            }
        }
        var deviceSentMessage = protoInputObject.deviceSentMessage();
        if (deviceSentMessage != null) {
            var deviceSentMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(deviceSentMessage);
            if (deviceSentMessage0 != null) {
                protoOutputStream.writeMessage(31, it.auties.whatsapp.model.message.server.DeviceSentMessageSpec.sizeOf(deviceSentMessage0));
                it.auties.whatsapp.model.message.server.DeviceSentMessageSpec.encode(deviceSentMessage0, protoOutputStream);
            }
        }
        var deviceSyncMessage = protoInputObject.deviceSyncMessage();
        if (deviceSyncMessage != null) {
            var deviceSyncMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(deviceSyncMessage);
            if (deviceSyncMessage0 != null) {
                protoOutputStream.writeMessage(32, it.auties.whatsapp.model.message.server.DeviceSyncMessageSpec.sizeOf(deviceSyncMessage0));
                it.auties.whatsapp.model.message.server.DeviceSyncMessageSpec.encode(deviceSyncMessage0, protoOutputStream);
            }
        }
        var listMessage = protoInputObject.listMessage();
        if (listMessage != null) {
            var listMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(listMessage);
            if (listMessage0 != null) {
                protoOutputStream.writeMessage(36, it.auties.whatsapp.model.message.button.ListMessageSpec.sizeOf(listMessage0));
                it.auties.whatsapp.model.message.button.ListMessageSpec.encode(listMessage0, protoOutputStream);
            }
        }
        var viewOnceMessage = protoInputObject.viewOnceMessage();
        if (viewOnceMessage != null) {
            var viewOnceMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(viewOnceMessage);
            if (viewOnceMessage0 != null) {
                protoOutputStream.writeMessage(37, it.auties.whatsapp.model.message.model.FutureMessageContainerSpec.sizeOf(viewOnceMessage0));
                it.auties.whatsapp.model.message.model.FutureMessageContainerSpec.encode(viewOnceMessage0, protoOutputStream);
            }
        }
        var orderMessage = protoInputObject.orderMessage();
        if (orderMessage != null) {
            var orderMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(orderMessage);
            if (orderMessage0 != null) {
                protoOutputStream.writeMessage(38, it.auties.whatsapp.model.message.payment.PaymentOrderMessageSpec.sizeOf(orderMessage0));
                it.auties.whatsapp.model.message.payment.PaymentOrderMessageSpec.encode(orderMessage0, protoOutputStream);
            }
        }
        var listResponseMessage = protoInputObject.listResponseMessage();
        if (listResponseMessage != null) {
            var listResponseMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(listResponseMessage);
            if (listResponseMessage0 != null) {
                protoOutputStream.writeMessage(39, it.auties.whatsapp.model.message.button.ListResponseMessageSpec.sizeOf(listResponseMessage0));
                it.auties.whatsapp.model.message.button.ListResponseMessageSpec.encode(listResponseMessage0, protoOutputStream);
            }
        }
        var ephemeralMessage = protoInputObject.ephemeralMessage();
        if (ephemeralMessage != null) {
            var ephemeralMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(ephemeralMessage);
            if (ephemeralMessage0 != null) {
                protoOutputStream.writeMessage(40, it.auties.whatsapp.model.message.model.FutureMessageContainerSpec.sizeOf(ephemeralMessage0));
                it.auties.whatsapp.model.message.model.FutureMessageContainerSpec.encode(ephemeralMessage0, protoOutputStream);
            }
        }
        var invoiceMessage = protoInputObject.invoiceMessage();
        if (invoiceMessage != null) {
            var invoiceMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(invoiceMessage);
            if (invoiceMessage0 != null) {
                protoOutputStream.writeMessage(41, it.auties.whatsapp.model.message.payment.PaymentInvoiceMessageSpec.sizeOf(invoiceMessage0));
                it.auties.whatsapp.model.message.payment.PaymentInvoiceMessageSpec.encode(invoiceMessage0, protoOutputStream);
            }
        }
        var buttonsMessage = protoInputObject.buttonsMessage();
        if (buttonsMessage != null) {
            var buttonsMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(buttonsMessage);
            if (buttonsMessage0 != null) {
                protoOutputStream.writeMessage(42, it.auties.whatsapp.model.message.button.ButtonsMessageSpec.sizeOf(buttonsMessage0));
                it.auties.whatsapp.model.message.button.ButtonsMessageSpec.encode(buttonsMessage0, protoOutputStream);
            }
        }
        var buttonsResponseMessage = protoInputObject.buttonsResponseMessage();
        if (buttonsResponseMessage != null) {
            var buttonsResponseMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(buttonsResponseMessage);
            if (buttonsResponseMessage0 != null) {
                protoOutputStream.writeMessage(43, it.auties.whatsapp.model.message.button.ButtonsResponseMessageSpec.sizeOf(buttonsResponseMessage0));
                it.auties.whatsapp.model.message.button.ButtonsResponseMessageSpec.encode(buttonsResponseMessage0, protoOutputStream);
            }
        }
        var paymentInviteMessage = protoInputObject.paymentInviteMessage();
        if (paymentInviteMessage != null) {
            var paymentInviteMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(paymentInviteMessage);
            if (paymentInviteMessage0 != null) {
                protoOutputStream.writeMessage(44, it.auties.whatsapp.model.message.payment.PaymentInviteMessageSpec.sizeOf(paymentInviteMessage0));
                it.auties.whatsapp.model.message.payment.PaymentInviteMessageSpec.encode(paymentInviteMessage0, protoOutputStream);
            }
        }
        var interactiveMessage = protoInputObject.interactiveMessage();
        if (interactiveMessage != null) {
            var interactiveMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(interactiveMessage);
            if (interactiveMessage0 != null) {
                protoOutputStream.writeMessage(45, it.auties.whatsapp.model.message.button.InteractiveMessageSpec.sizeOf(interactiveMessage0));
                it.auties.whatsapp.model.message.button.InteractiveMessageSpec.encode(interactiveMessage0, protoOutputStream);
            }
        }
        var reactionMessage = protoInputObject.reactionMessage();
        if (reactionMessage != null) {
            var reactionMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(reactionMessage);
            if (reactionMessage0 != null) {
                protoOutputStream.writeMessage(46, it.auties.whatsapp.model.message.standard.ReactionMessageSpec.sizeOf(reactionMessage0));
                it.auties.whatsapp.model.message.standard.ReactionMessageSpec.encode(reactionMessage0, protoOutputStream);
            }
        }
        var stickerSyncMessage = protoInputObject.stickerSyncMessage();
        if (stickerSyncMessage != null) {
            var stickerSyncMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(stickerSyncMessage);
            if (stickerSyncMessage0 != null) {
                protoOutputStream.writeMessage(47, it.auties.whatsapp.model.message.server.StickerSyncRMRMessageSpec.sizeOf(stickerSyncMessage0));
                it.auties.whatsapp.model.message.server.StickerSyncRMRMessageSpec.encode(stickerSyncMessage0, protoOutputStream);
            }
        }
        var interactiveResponseMessage = protoInputObject.interactiveResponseMessage();
        if (interactiveResponseMessage != null) {
            var interactiveResponseMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(interactiveResponseMessage);
            if (interactiveResponseMessage0 != null) {
                protoOutputStream.writeMessage(48, it.auties.whatsapp.model.message.button.InteractiveResponseMessageSpec.sizeOf(interactiveResponseMessage0));
                it.auties.whatsapp.model.message.button.InteractiveResponseMessageSpec.encode(interactiveResponseMessage0, protoOutputStream);
            }
        }
        var pollCreationMessage = protoInputObject.pollCreationMessage();
        if (pollCreationMessage != null) {
            var pollCreationMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(pollCreationMessage);
            if (pollCreationMessage0 != null) {
                protoOutputStream.writeMessage(49, it.auties.whatsapp.model.message.standard.PollCreationMessageSpec.sizeOf(pollCreationMessage0));
                it.auties.whatsapp.model.message.standard.PollCreationMessageSpec.encode(pollCreationMessage0, protoOutputStream);
            }
        }
        var pollUpdateMessage = protoInputObject.pollUpdateMessage();
        if (pollUpdateMessage != null) {
            var pollUpdateMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(pollUpdateMessage);
            if (pollUpdateMessage0 != null) {
                protoOutputStream.writeMessage(50, it.auties.whatsapp.model.message.standard.PollUpdateMessageSpec.sizeOf(pollUpdateMessage0));
                it.auties.whatsapp.model.message.standard.PollUpdateMessageSpec.encode(pollUpdateMessage0, protoOutputStream);
            }
        }
        var keepInChatMessage = protoInputObject.keepInChatMessage();
        if (keepInChatMessage != null) {
            var keepInChatMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(keepInChatMessage);
            if (keepInChatMessage0 != null) {
                protoOutputStream.writeMessage(51, it.auties.whatsapp.model.message.standard.KeepInChatMessageSpec.sizeOf(keepInChatMessage0));
                it.auties.whatsapp.model.message.standard.KeepInChatMessageSpec.encode(keepInChatMessage0, protoOutputStream);
            }
        }
        var documentWithCaptionMessage = protoInputObject.documentWithCaptionMessage();
        if (documentWithCaptionMessage != null) {
            var documentWithCaptionMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(documentWithCaptionMessage);
            if (documentWithCaptionMessage0 != null) {
                protoOutputStream.writeMessage(53, it.auties.whatsapp.model.message.model.FutureMessageContainerSpec.sizeOf(documentWithCaptionMessage0));
                it.auties.whatsapp.model.message.model.FutureMessageContainerSpec.encode(documentWithCaptionMessage0, protoOutputStream);
            }
        }
        var requestPhoneNumberMessage = protoInputObject.requestPhoneNumberMessage();
        if (requestPhoneNumberMessage != null) {
            var requestPhoneNumberMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(requestPhoneNumberMessage);
            if (requestPhoneNumberMessage0 != null) {
                protoOutputStream.writeMessage(54, it.auties.whatsapp.model.message.standard.RequestPhoneNumberMessageSpec.sizeOf(requestPhoneNumberMessage0));
                it.auties.whatsapp.model.message.standard.RequestPhoneNumberMessageSpec.encode(requestPhoneNumberMessage0, protoOutputStream);
            }
        }
        var viewOnceV2Message = protoInputObject.viewOnceV2Message();
        if (viewOnceV2Message != null) {
            var viewOnceV2Message0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(viewOnceV2Message);
            if (viewOnceV2Message0 != null) {
                protoOutputStream.writeMessage(55, it.auties.whatsapp.model.message.model.FutureMessageContainerSpec.sizeOf(viewOnceV2Message0));
                it.auties.whatsapp.model.message.model.FutureMessageContainerSpec.encode(viewOnceV2Message0, protoOutputStream);
            }
        }
        var encryptedReactionMessage = protoInputObject.encryptedReactionMessage();
        if (encryptedReactionMessage != null) {
            var encryptedReactionMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(encryptedReactionMessage);
            if (encryptedReactionMessage0 != null) {
                protoOutputStream.writeMessage(56, it.auties.whatsapp.model.message.standard.EncryptedReactionMessageSpec.sizeOf(encryptedReactionMessage0));
                it.auties.whatsapp.model.message.standard.EncryptedReactionMessageSpec.encode(encryptedReactionMessage0, protoOutputStream);
            }
        }
        var editedMessage = protoInputObject.editedMessage();
        if (editedMessage != null) {
            var editedMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(editedMessage);
            if (editedMessage0 != null) {
                protoOutputStream.writeMessage(58, it.auties.whatsapp.model.message.model.FutureMessageContainerSpec.sizeOf(editedMessage0));
                it.auties.whatsapp.model.message.model.FutureMessageContainerSpec.encode(editedMessage0, protoOutputStream);
            }
        }
        var viewOnceV2ExtensionMessage = protoInputObject.viewOnceV2ExtensionMessage();
        if (viewOnceV2ExtensionMessage != null) {
            var viewOnceV2ExtensionMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(viewOnceV2ExtensionMessage);
            if (viewOnceV2ExtensionMessage0 != null) {
                protoOutputStream.writeMessage(59, it.auties.whatsapp.model.message.model.FutureMessageContainerSpec.sizeOf(viewOnceV2ExtensionMessage0));
                it.auties.whatsapp.model.message.model.FutureMessageContainerSpec.encode(viewOnceV2ExtensionMessage0, protoOutputStream);
            }
        }
        var newsletterAdminInviteMessage = protoInputObject.newsletterAdminInviteMessage();
        if (newsletterAdminInviteMessage != null) {
            var newsletterAdminInviteMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(newsletterAdminInviteMessage);
            if (newsletterAdminInviteMessage0 != null) {
                protoOutputStream.writeMessage(78, it.auties.whatsapp.model.message.standard.NewsletterAdminInviteMessageSpec.sizeOf(newsletterAdminInviteMessage0));
                it.auties.whatsapp.model.message.standard.NewsletterAdminInviteMessageSpec.encode(newsletterAdminInviteMessage0, protoOutputStream);
            }
        }
        var deviceInfo = protoInputObject.deviceInfo();
        if (deviceInfo != null) {
            var deviceInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(deviceInfo);
            if (deviceInfo0 != null) {
                protoOutputStream.writeMessage(35, it.auties.whatsapp.model.info.DeviceContextInfoSpec.sizeOf(deviceInfo0));
                it.auties.whatsapp.model.info.DeviceContextInfoSpec.encode(deviceInfo0, protoOutputStream);
            }
        }
    }

    public static MessageContainer decode(byte[] protoInputObject) {
        if (protoInputObject == null) {
            return null;
        }
        return decode(ProtobufInputStream.fromBytes(protoInputObject, 0, protoInputObject.length));
    }

    public static MessageContainer decode(ProtobufInputStream protoInputStream) {
        java.util.Optional<java.lang.String> textWithNoContextMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.server.SenderKeyDistributionMessage> senderKeyDistributionMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.ImageMessage> imageMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.ContactMessage> contactMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.LocationMessage> locationMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.TextMessage> textMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.DocumentMessage> documentMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.AudioMessage> audioMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.VideoOrGifMessage> videoMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.CallMessage> callMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.server.ProtocolMessage> protocolMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.ContactsMessage> contactsArrayMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage> highlyStructuredMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.payment.SendPaymentMessage> sendPaymentMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.LiveLocationMessage> liveLocationMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.payment.RequestPaymentMessage> requestPaymentMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.payment.DeclinePaymentRequestMessage> declinePaymentRequestMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.payment.CancelPaymentRequestMessage> cancelPaymentRequestMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.button.TemplateMessage> templateMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.StickerMessage> stickerMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.GroupInviteMessage> groupInviteMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.button.TemplateReplyMessage> templateReplyMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.ProductMessage> productMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.server.DeviceSentMessage> deviceSentMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.server.DeviceSyncMessage> deviceSyncMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.button.ListMessage> listMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.model.FutureMessageContainer> viewOnceMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.payment.PaymentOrderMessage> orderMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.button.ListResponseMessage> listResponseMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.model.FutureMessageContainer> ephemeralMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.payment.PaymentInvoiceMessage> invoiceMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.button.ButtonsMessage> buttonsMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.button.ButtonsResponseMessage> buttonsResponseMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.payment.PaymentInviteMessage> paymentInviteMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.button.InteractiveMessage> interactiveMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.ReactionMessage> reactionMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.server.StickerSyncRMRMessage> stickerSyncMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.button.InteractiveResponseMessage> interactiveResponseMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.PollCreationMessage> pollCreationMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.PollUpdateMessage> pollUpdateMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.KeepInChatMessage> keepInChatMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.model.FutureMessageContainer> documentWithCaptionMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.RequestPhoneNumberMessage> requestPhoneNumberMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.model.FutureMessageContainer> viewOnceV2Message = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.EncryptedReactionMessage> encryptedReactionMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.model.FutureMessageContainer> editedMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.model.FutureMessageContainer> viewOnceV2ExtensionMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.message.standard.NewsletterAdminInviteMessage> newsletterAdminInviteMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        java.util.Optional<it.auties.whatsapp.model.info.DeviceContextInfo> deviceInfo = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        while (protoInputStream.readTag()) {
            var protoFieldIndex = protoInputStream.index();
            switch (protoFieldIndex) {
                case 1 -> textWithNoContextMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(protoInputStream.readString()));
                case 2 -> senderKeyDistributionMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.server.SenderKeyDistributionMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 3 -> imageMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.ImageMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 4 -> contactMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.ContactMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 5 -> locationMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.LocationMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 6 -> textMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.TextMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 7 -> documentMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.DocumentMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 8 -> audioMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.AudioMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 9 -> videoMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.VideoOrGifMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 10 -> callMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.CallMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 12 -> protocolMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.server.ProtocolMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 13 -> contactsArrayMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.ContactsMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 14 -> highlyStructuredMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 16 -> sendPaymentMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.payment.SendPaymentMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 18 -> liveLocationMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.LiveLocationMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 22 -> requestPaymentMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.payment.RequestPaymentMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 23 -> declinePaymentRequestMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.payment.DeclinePaymentRequestMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 24 -> cancelPaymentRequestMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.payment.CancelPaymentRequestMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 25 -> templateMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.button.TemplateMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 26 -> stickerMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.StickerMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 28 -> groupInviteMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.GroupInviteMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 29 -> templateReplyMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.button.TemplateReplyMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 30 -> productMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.ProductMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 31 -> deviceSentMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.server.DeviceSentMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 32 -> deviceSyncMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.server.DeviceSyncMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 36 -> listMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.button.ListMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 37 -> viewOnceMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.model.FutureMessageContainerSpec.decode(protoInputStream.readLengthDelimited()));
                case 38 -> orderMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.payment.PaymentOrderMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 39 -> listResponseMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.button.ListResponseMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 40 -> ephemeralMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.model.FutureMessageContainerSpec.decode(protoInputStream.readLengthDelimited()));
                case 41 -> invoiceMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.payment.PaymentInvoiceMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 42 -> buttonsMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.button.ButtonsMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 43 -> buttonsResponseMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.button.ButtonsResponseMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 44 -> paymentInviteMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.payment.PaymentInviteMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 45 -> interactiveMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.button.InteractiveMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 46 -> reactionMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.ReactionMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 47 -> stickerSyncMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.server.StickerSyncRMRMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 48 -> interactiveResponseMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.button.InteractiveResponseMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 49 -> pollCreationMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.PollCreationMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 50 -> pollUpdateMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.PollUpdateMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 51 -> keepInChatMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.KeepInChatMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 53 -> documentWithCaptionMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.model.FutureMessageContainerSpec.decode(protoInputStream.readLengthDelimited()));
                case 54 -> requestPhoneNumberMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.RequestPhoneNumberMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 55 -> viewOnceV2Message = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.model.FutureMessageContainerSpec.decode(protoInputStream.readLengthDelimited()));
                case 56 -> encryptedReactionMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.EncryptedReactionMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 58 -> editedMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.model.FutureMessageContainerSpec.decode(protoInputStream.readLengthDelimited()));
                case 59 -> viewOnceV2ExtensionMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.model.FutureMessageContainerSpec.decode(protoInputStream.readLengthDelimited()));
                case 78 -> newsletterAdminInviteMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.message.standard.NewsletterAdminInviteMessageSpec.decode(protoInputStream.readLengthDelimited()));
                case 35 -> deviceInfo = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.whatsapp.model.info.DeviceContextInfoSpec.decode(protoInputStream.readLengthDelimited()));
                default -> protoInputStream.readUnknown(false);
            }
        }
        return new it.auties.whatsapp.model.message.model.MessageContainer(textWithNoContextMessage, senderKeyDistributionMessage, imageMessage, contactMessage, locationMessage, textMessage, documentMessage, audioMessage, videoMessage, callMessage, protocolMessage, contactsArrayMessage, highlyStructuredMessage, sendPaymentMessage, liveLocationMessage, requestPaymentMessage, declinePaymentRequestMessage, cancelPaymentRequestMessage, templateMessage, stickerMessage, groupInviteMessage, templateReplyMessage, productMessage, deviceSentMessage, deviceSyncMessage, listMessage, viewOnceMessage, orderMessage, listResponseMessage, ephemeralMessage, invoiceMessage, buttonsMessage, buttonsResponseMessage, paymentInviteMessage, interactiveMessage, reactionMessage, stickerSyncMessage, interactiveResponseMessage, pollCreationMessage, pollUpdateMessage, keepInChatMessage, documentWithCaptionMessage, requestPhoneNumberMessage, viewOnceV2Message, encryptedReactionMessage, editedMessage, viewOnceV2ExtensionMessage, newsletterAdminInviteMessage, deviceInfo);
    }

    public static int sizeOf(MessageContainer protoInputObject) {
        if (protoInputObject == null) {
            return 0;
        }
        var protoOutputSize = 0;
        var textWithNoContextMessage = protoInputObject.textWithNoContextMessage();
        if (textWithNoContextMessage != null) {
            var textWithNoContextMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(textWithNoContextMessage);
            if (textWithNoContextMessage0 != null) {
                var textWithNoContextMessage1 = it.auties.protobuf.builtin.ProtobufLazyMixin.toValue(textWithNoContextMessage0);
                if (textWithNoContextMessage1 != null) {
                    protoOutputSize += ProtobufOutputStream.getFieldSize(1, 2);
                    protoOutputSize += ProtobufOutputStream.getStringSize(textWithNoContextMessage1);
                }
            }
        }
        var senderKeyDistributionMessage = protoInputObject.senderKeyDistributionMessage();
        if (senderKeyDistributionMessage != null) {
            var senderKeyDistributionMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(senderKeyDistributionMessage);
            if (senderKeyDistributionMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(2, 2);
                var senderKeyDistributionMessageSerializedSize = it.auties.whatsapp.model.message.server.SenderKeyDistributionMessageSpec.sizeOf(senderKeyDistributionMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(senderKeyDistributionMessageSerializedSize);
                protoOutputSize += senderKeyDistributionMessageSerializedSize;
            }
        }
        var imageMessage = protoInputObject.imageMessage();
        if (imageMessage != null) {
            var imageMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(imageMessage);
            if (imageMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(3, 2);
                var imageMessageSerializedSize = it.auties.whatsapp.model.message.standard.ImageMessageSpec.sizeOf(imageMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(imageMessageSerializedSize);
                protoOutputSize += imageMessageSerializedSize;
            }
        }
        var contactMessage = protoInputObject.contactMessage();
        if (contactMessage != null) {
            var contactMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contactMessage);
            if (contactMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(4, 2);
                var contactMessageSerializedSize = it.auties.whatsapp.model.message.standard.ContactMessageSpec.sizeOf(contactMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(contactMessageSerializedSize);
                protoOutputSize += contactMessageSerializedSize;
            }
        }
        var locationMessage = protoInputObject.locationMessage();
        if (locationMessage != null) {
            var locationMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(locationMessage);
            if (locationMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(5, 2);
                var locationMessageSerializedSize = it.auties.whatsapp.model.message.standard.LocationMessageSpec.sizeOf(locationMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(locationMessageSerializedSize);
                protoOutputSize += locationMessageSerializedSize;
            }
        }
        var textMessage = protoInputObject.textMessage();
        if (textMessage != null) {
            var textMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(textMessage);
            if (textMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(6, 2);
                var textMessageSerializedSize = it.auties.whatsapp.model.message.standard.TextMessageSpec.sizeOf(textMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(textMessageSerializedSize);
                protoOutputSize += textMessageSerializedSize;
            }
        }
        var documentMessage = protoInputObject.documentMessage();
        if (documentMessage != null) {
            var documentMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(documentMessage);
            if (documentMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(7, 2);
                var documentMessageSerializedSize = it.auties.whatsapp.model.message.standard.DocumentMessageSpec.sizeOf(documentMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(documentMessageSerializedSize);
                protoOutputSize += documentMessageSerializedSize;
            }
        }
        var audioMessage = protoInputObject.audioMessage();
        if (audioMessage != null) {
            var audioMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(audioMessage);
            if (audioMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(8, 2);
                var audioMessageSerializedSize = it.auties.whatsapp.model.message.standard.AudioMessageSpec.sizeOf(audioMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(audioMessageSerializedSize);
                protoOutputSize += audioMessageSerializedSize;
            }
        }
        var videoMessage = protoInputObject.videoMessage();
        if (videoMessage != null) {
            var videoMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(videoMessage);
            if (videoMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(9, 2);
                var videoMessageSerializedSize = it.auties.whatsapp.model.message.standard.VideoOrGifMessageSpec.sizeOf(videoMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(videoMessageSerializedSize);
                protoOutputSize += videoMessageSerializedSize;
            }
        }
        var callMessage = protoInputObject.callMessage();
        if (callMessage != null) {
            var callMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(callMessage);
            if (callMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(10, 2);
                var callMessageSerializedSize = it.auties.whatsapp.model.message.standard.CallMessageSpec.sizeOf(callMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(callMessageSerializedSize);
                protoOutputSize += callMessageSerializedSize;
            }
        }
        var protocolMessage = protoInputObject.protocolMessage();
        if (protocolMessage != null) {
            var protocolMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(protocolMessage);
            if (protocolMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(12, 2);
                var protocolMessageSerializedSize = it.auties.whatsapp.model.message.server.ProtocolMessageSpec.sizeOf(protocolMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(protocolMessageSerializedSize);
                protoOutputSize += protocolMessageSerializedSize;
            }
        }
        var contactsArrayMessage = protoInputObject.contactsArrayMessage();
        if (contactsArrayMessage != null) {
            var contactsArrayMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(contactsArrayMessage);
            if (contactsArrayMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(13, 2);
                var contactsArrayMessageSerializedSize = it.auties.whatsapp.model.message.standard.ContactsMessageSpec.sizeOf(contactsArrayMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(contactsArrayMessageSerializedSize);
                protoOutputSize += contactsArrayMessageSerializedSize;
            }
        }
        var highlyStructuredMessage = protoInputObject.highlyStructuredMessage();
        if (highlyStructuredMessage != null) {
            var highlyStructuredMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(highlyStructuredMessage);
            if (highlyStructuredMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(14, 2);
                var highlyStructuredMessageSerializedSize = it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessageSpec.sizeOf(highlyStructuredMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(highlyStructuredMessageSerializedSize);
                protoOutputSize += highlyStructuredMessageSerializedSize;
            }
        }
        var sendPaymentMessage = protoInputObject.sendPaymentMessage();
        if (sendPaymentMessage != null) {
            var sendPaymentMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(sendPaymentMessage);
            if (sendPaymentMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(16, 2);
                var sendPaymentMessageSerializedSize = it.auties.whatsapp.model.message.payment.SendPaymentMessageSpec.sizeOf(sendPaymentMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(sendPaymentMessageSerializedSize);
                protoOutputSize += sendPaymentMessageSerializedSize;
            }
        }
        var liveLocationMessage = protoInputObject.liveLocationMessage();
        if (liveLocationMessage != null) {
            var liveLocationMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(liveLocationMessage);
            if (liveLocationMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(18, 2);
                var liveLocationMessageSerializedSize = it.auties.whatsapp.model.message.standard.LiveLocationMessageSpec.sizeOf(liveLocationMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(liveLocationMessageSerializedSize);
                protoOutputSize += liveLocationMessageSerializedSize;
            }
        }
        var requestPaymentMessage = protoInputObject.requestPaymentMessage();
        if (requestPaymentMessage != null) {
            var requestPaymentMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(requestPaymentMessage);
            if (requestPaymentMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(22, 2);
                var requestPaymentMessageSerializedSize = it.auties.whatsapp.model.message.payment.RequestPaymentMessageSpec.sizeOf(requestPaymentMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(requestPaymentMessageSerializedSize);
                protoOutputSize += requestPaymentMessageSerializedSize;
            }
        }
        var declinePaymentRequestMessage = protoInputObject.declinePaymentRequestMessage();
        if (declinePaymentRequestMessage != null) {
            var declinePaymentRequestMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(declinePaymentRequestMessage);
            if (declinePaymentRequestMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(23, 2);
                var declinePaymentRequestMessageSerializedSize = it.auties.whatsapp.model.message.payment.DeclinePaymentRequestMessageSpec.sizeOf(declinePaymentRequestMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(declinePaymentRequestMessageSerializedSize);
                protoOutputSize += declinePaymentRequestMessageSerializedSize;
            }
        }
        var cancelPaymentRequestMessage = protoInputObject.cancelPaymentRequestMessage();
        if (cancelPaymentRequestMessage != null) {
            var cancelPaymentRequestMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(cancelPaymentRequestMessage);
            if (cancelPaymentRequestMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(24, 2);
                var cancelPaymentRequestMessageSerializedSize = it.auties.whatsapp.model.message.payment.CancelPaymentRequestMessageSpec.sizeOf(cancelPaymentRequestMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(cancelPaymentRequestMessageSerializedSize);
                protoOutputSize += cancelPaymentRequestMessageSerializedSize;
            }
        }
        var templateMessage = protoInputObject.templateMessage();
        if (templateMessage != null) {
            var templateMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(templateMessage);
            if (templateMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(25, 2);
                var templateMessageSerializedSize = it.auties.whatsapp.model.message.button.TemplateMessageSpec.sizeOf(templateMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(templateMessageSerializedSize);
                protoOutputSize += templateMessageSerializedSize;
            }
        }
        var stickerMessage = protoInputObject.stickerMessage();
        if (stickerMessage != null) {
            var stickerMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(stickerMessage);
            if (stickerMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(26, 2);
                var stickerMessageSerializedSize = it.auties.whatsapp.model.message.standard.StickerMessageSpec.sizeOf(stickerMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(stickerMessageSerializedSize);
                protoOutputSize += stickerMessageSerializedSize;
            }
        }
        var groupInviteMessage = protoInputObject.groupInviteMessage();
        if (groupInviteMessage != null) {
            var groupInviteMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(groupInviteMessage);
            if (groupInviteMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(28, 2);
                var groupInviteMessageSerializedSize = it.auties.whatsapp.model.message.standard.GroupInviteMessageSpec.sizeOf(groupInviteMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(groupInviteMessageSerializedSize);
                protoOutputSize += groupInviteMessageSerializedSize;
            }
        }
        var templateReplyMessage = protoInputObject.templateReplyMessage();
        if (templateReplyMessage != null) {
            var templateReplyMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(templateReplyMessage);
            if (templateReplyMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(29, 2);
                var templateReplyMessageSerializedSize = it.auties.whatsapp.model.message.button.TemplateReplyMessageSpec.sizeOf(templateReplyMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(templateReplyMessageSerializedSize);
                protoOutputSize += templateReplyMessageSerializedSize;
            }
        }
        var productMessage = protoInputObject.productMessage();
        if (productMessage != null) {
            var productMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(productMessage);
            if (productMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(30, 2);
                var productMessageSerializedSize = it.auties.whatsapp.model.message.standard.ProductMessageSpec.sizeOf(productMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(productMessageSerializedSize);
                protoOutputSize += productMessageSerializedSize;
            }
        }
        var deviceSentMessage = protoInputObject.deviceSentMessage();
        if (deviceSentMessage != null) {
            var deviceSentMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(deviceSentMessage);
            if (deviceSentMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(31, 2);
                var deviceSentMessageSerializedSize = it.auties.whatsapp.model.message.server.DeviceSentMessageSpec.sizeOf(deviceSentMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(deviceSentMessageSerializedSize);
                protoOutputSize += deviceSentMessageSerializedSize;
            }
        }
        var deviceSyncMessage = protoInputObject.deviceSyncMessage();
        if (deviceSyncMessage != null) {
            var deviceSyncMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(deviceSyncMessage);
            if (deviceSyncMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(32, 2);
                var deviceSyncMessageSerializedSize = it.auties.whatsapp.model.message.server.DeviceSyncMessageSpec.sizeOf(deviceSyncMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(deviceSyncMessageSerializedSize);
                protoOutputSize += deviceSyncMessageSerializedSize;
            }
        }
        var listMessage = protoInputObject.listMessage();
        if (listMessage != null) {
            var listMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(listMessage);
            if (listMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(36, 2);
                var listMessageSerializedSize = it.auties.whatsapp.model.message.button.ListMessageSpec.sizeOf(listMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(listMessageSerializedSize);
                protoOutputSize += listMessageSerializedSize;
            }
        }
        var viewOnceMessage = protoInputObject.viewOnceMessage();
        if (viewOnceMessage != null) {
            var viewOnceMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(viewOnceMessage);
            if (viewOnceMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(37, 2);
                var viewOnceMessageSerializedSize = it.auties.whatsapp.model.message.model.FutureMessageContainerSpec.sizeOf(viewOnceMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(viewOnceMessageSerializedSize);
                protoOutputSize += viewOnceMessageSerializedSize;
            }
        }
        var orderMessage = protoInputObject.orderMessage();
        if (orderMessage != null) {
            var orderMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(orderMessage);
            if (orderMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(38, 2);
                var orderMessageSerializedSize = it.auties.whatsapp.model.message.payment.PaymentOrderMessageSpec.sizeOf(orderMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(orderMessageSerializedSize);
                protoOutputSize += orderMessageSerializedSize;
            }
        }
        var listResponseMessage = protoInputObject.listResponseMessage();
        if (listResponseMessage != null) {
            var listResponseMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(listResponseMessage);
            if (listResponseMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(39, 2);
                var listResponseMessageSerializedSize = it.auties.whatsapp.model.message.button.ListResponseMessageSpec.sizeOf(listResponseMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(listResponseMessageSerializedSize);
                protoOutputSize += listResponseMessageSerializedSize;
            }
        }
        var ephemeralMessage = protoInputObject.ephemeralMessage();
        if (ephemeralMessage != null) {
            var ephemeralMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(ephemeralMessage);
            if (ephemeralMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(40, 2);
                var ephemeralMessageSerializedSize = it.auties.whatsapp.model.message.model.FutureMessageContainerSpec.sizeOf(ephemeralMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(ephemeralMessageSerializedSize);
                protoOutputSize += ephemeralMessageSerializedSize;
            }
        }
        var invoiceMessage = protoInputObject.invoiceMessage();
        if (invoiceMessage != null) {
            var invoiceMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(invoiceMessage);
            if (invoiceMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(41, 2);
                var invoiceMessageSerializedSize = it.auties.whatsapp.model.message.payment.PaymentInvoiceMessageSpec.sizeOf(invoiceMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(invoiceMessageSerializedSize);
                protoOutputSize += invoiceMessageSerializedSize;
            }
        }
        var buttonsMessage = protoInputObject.buttonsMessage();
        if (buttonsMessage != null) {
            var buttonsMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(buttonsMessage);
            if (buttonsMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(42, 2);
                var buttonsMessageSerializedSize = it.auties.whatsapp.model.message.button.ButtonsMessageSpec.sizeOf(buttonsMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(buttonsMessageSerializedSize);
                protoOutputSize += buttonsMessageSerializedSize;
            }
        }
        var buttonsResponseMessage = protoInputObject.buttonsResponseMessage();
        if (buttonsResponseMessage != null) {
            var buttonsResponseMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(buttonsResponseMessage);
            if (buttonsResponseMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(43, 2);
                var buttonsResponseMessageSerializedSize = it.auties.whatsapp.model.message.button.ButtonsResponseMessageSpec.sizeOf(buttonsResponseMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(buttonsResponseMessageSerializedSize);
                protoOutputSize += buttonsResponseMessageSerializedSize;
            }
        }
        var paymentInviteMessage = protoInputObject.paymentInviteMessage();
        if (paymentInviteMessage != null) {
            var paymentInviteMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(paymentInviteMessage);
            if (paymentInviteMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(44, 2);
                var paymentInviteMessageSerializedSize = it.auties.whatsapp.model.message.payment.PaymentInviteMessageSpec.sizeOf(paymentInviteMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(paymentInviteMessageSerializedSize);
                protoOutputSize += paymentInviteMessageSerializedSize;
            }
        }
        var interactiveMessage = protoInputObject.interactiveMessage();
        if (interactiveMessage != null) {
            var interactiveMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(interactiveMessage);
            if (interactiveMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(45, 2);
                var interactiveMessageSerializedSize = it.auties.whatsapp.model.message.button.InteractiveMessageSpec.sizeOf(interactiveMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(interactiveMessageSerializedSize);
                protoOutputSize += interactiveMessageSerializedSize;
            }
        }
        var reactionMessage = protoInputObject.reactionMessage();
        if (reactionMessage != null) {
            var reactionMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(reactionMessage);
            if (reactionMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(46, 2);
                var reactionMessageSerializedSize = it.auties.whatsapp.model.message.standard.ReactionMessageSpec.sizeOf(reactionMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(reactionMessageSerializedSize);
                protoOutputSize += reactionMessageSerializedSize;
            }
        }
        var stickerSyncMessage = protoInputObject.stickerSyncMessage();
        if (stickerSyncMessage != null) {
            var stickerSyncMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(stickerSyncMessage);
            if (stickerSyncMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(47, 2);
                var stickerSyncMessageSerializedSize = it.auties.whatsapp.model.message.server.StickerSyncRMRMessageSpec.sizeOf(stickerSyncMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(stickerSyncMessageSerializedSize);
                protoOutputSize += stickerSyncMessageSerializedSize;
            }
        }
        var interactiveResponseMessage = protoInputObject.interactiveResponseMessage();
        if (interactiveResponseMessage != null) {
            var interactiveResponseMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(interactiveResponseMessage);
            if (interactiveResponseMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(48, 2);
                var interactiveResponseMessageSerializedSize = it.auties.whatsapp.model.message.button.InteractiveResponseMessageSpec.sizeOf(interactiveResponseMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(interactiveResponseMessageSerializedSize);
                protoOutputSize += interactiveResponseMessageSerializedSize;
            }
        }
        var pollCreationMessage = protoInputObject.pollCreationMessage();
        if (pollCreationMessage != null) {
            var pollCreationMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(pollCreationMessage);
            if (pollCreationMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(49, 2);
                var pollCreationMessageSerializedSize = it.auties.whatsapp.model.message.standard.PollCreationMessageSpec.sizeOf(pollCreationMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(pollCreationMessageSerializedSize);
                protoOutputSize += pollCreationMessageSerializedSize;
            }
        }
        var pollUpdateMessage = protoInputObject.pollUpdateMessage();
        if (pollUpdateMessage != null) {
            var pollUpdateMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(pollUpdateMessage);
            if (pollUpdateMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(50, 2);
                var pollUpdateMessageSerializedSize = it.auties.whatsapp.model.message.standard.PollUpdateMessageSpec.sizeOf(pollUpdateMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(pollUpdateMessageSerializedSize);
                protoOutputSize += pollUpdateMessageSerializedSize;
            }
        }
        var keepInChatMessage = protoInputObject.keepInChatMessage();
        if (keepInChatMessage != null) {
            var keepInChatMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(keepInChatMessage);
            if (keepInChatMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(51, 2);
                var keepInChatMessageSerializedSize = it.auties.whatsapp.model.message.standard.KeepInChatMessageSpec.sizeOf(keepInChatMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(keepInChatMessageSerializedSize);
                protoOutputSize += keepInChatMessageSerializedSize;
            }
        }
        var documentWithCaptionMessage = protoInputObject.documentWithCaptionMessage();
        if (documentWithCaptionMessage != null) {
            var documentWithCaptionMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(documentWithCaptionMessage);
            if (documentWithCaptionMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(53, 2);
                var documentWithCaptionMessageSerializedSize = it.auties.whatsapp.model.message.model.FutureMessageContainerSpec.sizeOf(documentWithCaptionMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(documentWithCaptionMessageSerializedSize);
                protoOutputSize += documentWithCaptionMessageSerializedSize;
            }
        }
        var requestPhoneNumberMessage = protoInputObject.requestPhoneNumberMessage();
        if (requestPhoneNumberMessage != null) {
            var requestPhoneNumberMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(requestPhoneNumberMessage);
            if (requestPhoneNumberMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(54, 2);
                var requestPhoneNumberMessageSerializedSize = it.auties.whatsapp.model.message.standard.RequestPhoneNumberMessageSpec.sizeOf(requestPhoneNumberMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(requestPhoneNumberMessageSerializedSize);
                protoOutputSize += requestPhoneNumberMessageSerializedSize;
            }
        }
        var viewOnceV2Message = protoInputObject.viewOnceV2Message();
        if (viewOnceV2Message != null) {
            var viewOnceV2Message0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(viewOnceV2Message);
            if (viewOnceV2Message0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(55, 2);
                var viewOnceV2MessageSerializedSize = it.auties.whatsapp.model.message.model.FutureMessageContainerSpec.sizeOf(viewOnceV2Message0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(viewOnceV2MessageSerializedSize);
                protoOutputSize += viewOnceV2MessageSerializedSize;
            }
        }
        var encryptedReactionMessage = protoInputObject.encryptedReactionMessage();
        if (encryptedReactionMessage != null) {
            var encryptedReactionMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(encryptedReactionMessage);
            if (encryptedReactionMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(56, 2);
                var encryptedReactionMessageSerializedSize = it.auties.whatsapp.model.message.standard.EncryptedReactionMessageSpec.sizeOf(encryptedReactionMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(encryptedReactionMessageSerializedSize);
                protoOutputSize += encryptedReactionMessageSerializedSize;
            }
        }
        var editedMessage = protoInputObject.editedMessage();
        if (editedMessage != null) {
            var editedMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(editedMessage);
            if (editedMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(58, 2);
                var editedMessageSerializedSize = it.auties.whatsapp.model.message.model.FutureMessageContainerSpec.sizeOf(editedMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(editedMessageSerializedSize);
                protoOutputSize += editedMessageSerializedSize;
            }
        }
        var viewOnceV2ExtensionMessage = protoInputObject.viewOnceV2ExtensionMessage();
        if (viewOnceV2ExtensionMessage != null) {
            var viewOnceV2ExtensionMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(viewOnceV2ExtensionMessage);
            if (viewOnceV2ExtensionMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(59, 2);
                var viewOnceV2ExtensionMessageSerializedSize = it.auties.whatsapp.model.message.model.FutureMessageContainerSpec.sizeOf(viewOnceV2ExtensionMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(viewOnceV2ExtensionMessageSerializedSize);
                protoOutputSize += viewOnceV2ExtensionMessageSerializedSize;
            }
        }
        var newsletterAdminInviteMessage = protoInputObject.newsletterAdminInviteMessage();
        if (newsletterAdminInviteMessage != null) {
            var newsletterAdminInviteMessage0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(newsletterAdminInviteMessage);
            if (newsletterAdminInviteMessage0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(78, 2);
                var newsletterAdminInviteMessageSerializedSize = it.auties.whatsapp.model.message.standard.NewsletterAdminInviteMessageSpec.sizeOf(newsletterAdminInviteMessage0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(newsletterAdminInviteMessageSerializedSize);
                protoOutputSize += newsletterAdminInviteMessageSerializedSize;
            }
        }
        var deviceInfo = protoInputObject.deviceInfo();
        if (deviceInfo != null) {
            var deviceInfo0 = it.auties.protobuf.builtin.ProtobufOptionalMixin.toNullableValue(deviceInfo);
            if (deviceInfo0 != null) {
                protoOutputSize += ProtobufOutputStream.getFieldSize(35, 2);
                var deviceInfoSerializedSize = it.auties.whatsapp.model.info.DeviceContextInfoSpec.sizeOf(deviceInfo0);
                protoOutputSize += ProtobufOutputStream.getVarIntSize(deviceInfoSerializedSize);
                protoOutputSize += deviceInfoSerializedSize;
            }
        }
        return protoOutputSize;
    }

}
