package it.auties.whatsapp.model.message.model;

public class MessageContainerBuilder {
    private java.util.Optional<java.lang.String> textWithNoContextMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.server.SenderKeyDistributionMessage> senderKeyDistributionMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.ImageMessage> imageMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.ContactMessage> contactMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.LocationMessage> locationMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.TextMessage> textMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.DocumentMessage> documentMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.AudioMessage> audioMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.VideoOrGifMessage> videoMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.CallMessage> callMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.server.ProtocolMessage> protocolMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.ContactsMessage> contactsArrayMessage;
    private java.util.Optional<it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage> highlyStructuredMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.payment.SendPaymentMessage> sendPaymentMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.LiveLocationMessage> liveLocationMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.payment.RequestPaymentMessage> requestPaymentMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.payment.DeclinePaymentRequestMessage> declinePaymentRequestMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.payment.CancelPaymentRequestMessage> cancelPaymentRequestMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.button.TemplateMessage> templateMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.StickerMessage> stickerMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.GroupInviteMessage> groupInviteMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.button.TemplateReplyMessage> templateReplyMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.ProductMessage> productMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.server.DeviceSentMessage> deviceSentMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.server.DeviceSyncMessage> deviceSyncMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.button.ListMessage> listMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.model.FutureMessageContainer> viewOnceMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.payment.PaymentOrderMessage> orderMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.button.ListResponseMessage> listResponseMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.model.FutureMessageContainer> ephemeralMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.payment.PaymentInvoiceMessage> invoiceMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.button.ButtonsMessage> buttonsMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.button.ButtonsResponseMessage> buttonsResponseMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.payment.PaymentInviteMessage> paymentInviteMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.button.InteractiveMessage> interactiveMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.ReactionMessage> reactionMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.server.StickerSyncRMRMessage> stickerSyncMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.button.InteractiveResponseMessage> interactiveResponseMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.PollCreationMessage> pollCreationMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.PollUpdateMessage> pollUpdateMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.KeepInChatMessage> keepInChatMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.model.FutureMessageContainer> documentWithCaptionMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.RequestPhoneNumberMessage> requestPhoneNumberMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.model.FutureMessageContainer> viewOnceV2Message;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.EncryptedReactionMessage> encryptedReactionMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.model.FutureMessageContainer> editedMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.model.FutureMessageContainer> viewOnceV2ExtensionMessage;
    private java.util.Optional<it.auties.whatsapp.model.message.standard.NewsletterAdminInviteMessage> newsletterAdminInviteMessage;
    private java.util.Optional<it.auties.whatsapp.model.info.DeviceContextInfo> deviceInfo;

    public MessageContainerBuilder() {
        textWithNoContextMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        senderKeyDistributionMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        imageMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        contactMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        locationMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        textMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        documentMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        audioMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        videoMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        callMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        protocolMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        contactsArrayMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        highlyStructuredMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        sendPaymentMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        liveLocationMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        requestPaymentMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        declinePaymentRequestMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        cancelPaymentRequestMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        templateMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        stickerMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        groupInviteMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        templateReplyMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        productMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        deviceSentMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        deviceSyncMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        listMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        viewOnceMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        orderMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        listResponseMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        ephemeralMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        invoiceMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        buttonsMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        buttonsResponseMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        paymentInviteMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        interactiveMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        reactionMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        stickerSyncMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        interactiveResponseMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        pollCreationMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        pollUpdateMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        keepInChatMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        documentWithCaptionMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        requestPhoneNumberMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        viewOnceV2Message = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        encryptedReactionMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        editedMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        viewOnceV2ExtensionMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        newsletterAdminInviteMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
        deviceInfo = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptional();
    }

    public MessageContainerBuilder textWithNoContextMessage(it.auties.protobuf.model.ProtobufString textWithNoContextMessage) {
        this.textWithNoContextMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(it.auties.protobuf.builtin.ProtobufLazyMixin.ofNullable(textWithNoContextMessage));
        return this;
    }

    public MessageContainerBuilder textWithNoContextMessage(java.lang.String textWithNoContextMessage) {
        this.textWithNoContextMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(textWithNoContextMessage);
        return this;
    }

    public MessageContainerBuilder senderKeyDistributionMessage(it.auties.whatsapp.model.message.server.SenderKeyDistributionMessage senderKeyDistributionMessage) {
        this.senderKeyDistributionMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(senderKeyDistributionMessage);
        return this;
    }

    public MessageContainerBuilder imageMessage(it.auties.whatsapp.model.message.standard.ImageMessage imageMessage) {
        this.imageMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(imageMessage);
        return this;
    }

    public MessageContainerBuilder contactMessage(it.auties.whatsapp.model.message.standard.ContactMessage contactMessage) {
        this.contactMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(contactMessage);
        return this;
    }

    public MessageContainerBuilder locationMessage(it.auties.whatsapp.model.message.standard.LocationMessage locationMessage) {
        this.locationMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(locationMessage);
        return this;
    }

    public MessageContainerBuilder textMessage(it.auties.whatsapp.model.message.standard.TextMessage textMessage) {
        this.textMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(textMessage);
        return this;
    }

    public MessageContainerBuilder documentMessage(it.auties.whatsapp.model.message.standard.DocumentMessage documentMessage) {
        this.documentMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(documentMessage);
        return this;
    }

    public MessageContainerBuilder audioMessage(it.auties.whatsapp.model.message.standard.AudioMessage audioMessage) {
        this.audioMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(audioMessage);
        return this;
    }

    public MessageContainerBuilder videoMessage(it.auties.whatsapp.model.message.standard.VideoOrGifMessage videoMessage) {
        this.videoMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(videoMessage);
        return this;
    }

    public MessageContainerBuilder callMessage(it.auties.whatsapp.model.message.standard.CallMessage callMessage) {
        this.callMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(callMessage);
        return this;
    }

    public MessageContainerBuilder protocolMessage(it.auties.whatsapp.model.message.server.ProtocolMessage protocolMessage) {
        this.protocolMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(protocolMessage);
        return this;
    }

    public MessageContainerBuilder contactsArrayMessage(it.auties.whatsapp.model.message.standard.ContactsMessage contactsArrayMessage) {
        this.contactsArrayMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(contactsArrayMessage);
        return this;
    }

    public MessageContainerBuilder highlyStructuredMessage(it.auties.whatsapp.model.button.template.highlyStructured.HighlyStructuredMessage highlyStructuredMessage) {
        this.highlyStructuredMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(highlyStructuredMessage);
        return this;
    }

    public MessageContainerBuilder sendPaymentMessage(it.auties.whatsapp.model.message.payment.SendPaymentMessage sendPaymentMessage) {
        this.sendPaymentMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(sendPaymentMessage);
        return this;
    }

    public MessageContainerBuilder liveLocationMessage(it.auties.whatsapp.model.message.standard.LiveLocationMessage liveLocationMessage) {
        this.liveLocationMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(liveLocationMessage);
        return this;
    }

    public MessageContainerBuilder requestPaymentMessage(it.auties.whatsapp.model.message.payment.RequestPaymentMessage requestPaymentMessage) {
        this.requestPaymentMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(requestPaymentMessage);
        return this;
    }

    public MessageContainerBuilder declinePaymentRequestMessage(it.auties.whatsapp.model.message.payment.DeclinePaymentRequestMessage declinePaymentRequestMessage) {
        this.declinePaymentRequestMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(declinePaymentRequestMessage);
        return this;
    }

    public MessageContainerBuilder cancelPaymentRequestMessage(it.auties.whatsapp.model.message.payment.CancelPaymentRequestMessage cancelPaymentRequestMessage) {
        this.cancelPaymentRequestMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(cancelPaymentRequestMessage);
        return this;
    }

    public MessageContainerBuilder templateMessage(it.auties.whatsapp.model.message.button.TemplateMessage templateMessage) {
        this.templateMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(templateMessage);
        return this;
    }

    public MessageContainerBuilder stickerMessage(it.auties.whatsapp.model.message.standard.StickerMessage stickerMessage) {
        this.stickerMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(stickerMessage);
        return this;
    }

    public MessageContainerBuilder groupInviteMessage(it.auties.whatsapp.model.message.standard.GroupInviteMessage groupInviteMessage) {
        this.groupInviteMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(groupInviteMessage);
        return this;
    }

    public MessageContainerBuilder templateReplyMessage(it.auties.whatsapp.model.message.button.TemplateReplyMessage templateReplyMessage) {
        this.templateReplyMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(templateReplyMessage);
        return this;
    }

    public MessageContainerBuilder productMessage(it.auties.whatsapp.model.message.standard.ProductMessage productMessage) {
        this.productMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(productMessage);
        return this;
    }

    public MessageContainerBuilder deviceSentMessage(it.auties.whatsapp.model.message.server.DeviceSentMessage deviceSentMessage) {
        this.deviceSentMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(deviceSentMessage);
        return this;
    }

    public MessageContainerBuilder deviceSyncMessage(it.auties.whatsapp.model.message.server.DeviceSyncMessage deviceSyncMessage) {
        this.deviceSyncMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(deviceSyncMessage);
        return this;
    }

    public MessageContainerBuilder listMessage(it.auties.whatsapp.model.message.button.ListMessage listMessage) {
        this.listMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(listMessage);
        return this;
    }

    public MessageContainerBuilder viewOnceMessage(it.auties.whatsapp.model.message.model.FutureMessageContainer viewOnceMessage) {
        this.viewOnceMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(viewOnceMessage);
        return this;
    }

    public MessageContainerBuilder orderMessage(it.auties.whatsapp.model.message.payment.PaymentOrderMessage orderMessage) {
        this.orderMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(orderMessage);
        return this;
    }

    public MessageContainerBuilder listResponseMessage(it.auties.whatsapp.model.message.button.ListResponseMessage listResponseMessage) {
        this.listResponseMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(listResponseMessage);
        return this;
    }

    public MessageContainerBuilder ephemeralMessage(it.auties.whatsapp.model.message.model.FutureMessageContainer ephemeralMessage) {
        this.ephemeralMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(ephemeralMessage);
        return this;
    }

    public MessageContainerBuilder invoiceMessage(it.auties.whatsapp.model.message.payment.PaymentInvoiceMessage invoiceMessage) {
        this.invoiceMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(invoiceMessage);
        return this;
    }

    public MessageContainerBuilder buttonsMessage(it.auties.whatsapp.model.message.button.ButtonsMessage buttonsMessage) {
        this.buttonsMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(buttonsMessage);
        return this;
    }

    public MessageContainerBuilder buttonsResponseMessage(it.auties.whatsapp.model.message.button.ButtonsResponseMessage buttonsResponseMessage) {
        this.buttonsResponseMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(buttonsResponseMessage);
        return this;
    }

    public MessageContainerBuilder paymentInviteMessage(it.auties.whatsapp.model.message.payment.PaymentInviteMessage paymentInviteMessage) {
        this.paymentInviteMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(paymentInviteMessage);
        return this;
    }

    public MessageContainerBuilder interactiveMessage(it.auties.whatsapp.model.message.button.InteractiveMessage interactiveMessage) {
        this.interactiveMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(interactiveMessage);
        return this;
    }

    public MessageContainerBuilder reactionMessage(it.auties.whatsapp.model.message.standard.ReactionMessage reactionMessage) {
        this.reactionMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(reactionMessage);
        return this;
    }

    public MessageContainerBuilder stickerSyncMessage(it.auties.whatsapp.model.message.server.StickerSyncRMRMessage stickerSyncMessage) {
        this.stickerSyncMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(stickerSyncMessage);
        return this;
    }

    public MessageContainerBuilder interactiveResponseMessage(it.auties.whatsapp.model.message.button.InteractiveResponseMessage interactiveResponseMessage) {
        this.interactiveResponseMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(interactiveResponseMessage);
        return this;
    }

    public MessageContainerBuilder pollCreationMessage(it.auties.whatsapp.model.message.standard.PollCreationMessage pollCreationMessage) {
        this.pollCreationMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(pollCreationMessage);
        return this;
    }

    public MessageContainerBuilder pollUpdateMessage(it.auties.whatsapp.model.message.standard.PollUpdateMessage pollUpdateMessage) {
        this.pollUpdateMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(pollUpdateMessage);
        return this;
    }

    public MessageContainerBuilder keepInChatMessage(it.auties.whatsapp.model.message.standard.KeepInChatMessage keepInChatMessage) {
        this.keepInChatMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(keepInChatMessage);
        return this;
    }

    public MessageContainerBuilder documentWithCaptionMessage(it.auties.whatsapp.model.message.model.FutureMessageContainer documentWithCaptionMessage) {
        this.documentWithCaptionMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(documentWithCaptionMessage);
        return this;
    }

    public MessageContainerBuilder requestPhoneNumberMessage(it.auties.whatsapp.model.message.standard.RequestPhoneNumberMessage requestPhoneNumberMessage) {
        this.requestPhoneNumberMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(requestPhoneNumberMessage);
        return this;
    }

    public MessageContainerBuilder viewOnceV2Message(it.auties.whatsapp.model.message.model.FutureMessageContainer viewOnceV2Message) {
        this.viewOnceV2Message = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(viewOnceV2Message);
        return this;
    }

    public MessageContainerBuilder encryptedReactionMessage(it.auties.whatsapp.model.message.standard.EncryptedReactionMessage encryptedReactionMessage) {
        this.encryptedReactionMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(encryptedReactionMessage);
        return this;
    }

    public MessageContainerBuilder editedMessage(it.auties.whatsapp.model.message.model.FutureMessageContainer editedMessage) {
        this.editedMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(editedMessage);
        return this;
    }

    public MessageContainerBuilder viewOnceV2ExtensionMessage(it.auties.whatsapp.model.message.model.FutureMessageContainer viewOnceV2ExtensionMessage) {
        this.viewOnceV2ExtensionMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(viewOnceV2ExtensionMessage);
        return this;
    }

    public MessageContainerBuilder newsletterAdminInviteMessage(it.auties.whatsapp.model.message.standard.NewsletterAdminInviteMessage newsletterAdminInviteMessage) {
        this.newsletterAdminInviteMessage = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(newsletterAdminInviteMessage);
        return this;
    }

    public MessageContainerBuilder deviceInfo(it.auties.whatsapp.model.info.DeviceContextInfo deviceInfo) {
        this.deviceInfo = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(deviceInfo);
        return this;
    }

    public it.auties.whatsapp.model.message.model.MessageContainer build() {
        return new it.auties.whatsapp.model.message.model.MessageContainer(textWithNoContextMessage, senderKeyDistributionMessage, imageMessage, contactMessage, locationMessage, textMessage, documentMessage, audioMessage, videoMessage, callMessage, protocolMessage, contactsArrayMessage, highlyStructuredMessage, sendPaymentMessage, liveLocationMessage, requestPaymentMessage, declinePaymentRequestMessage, cancelPaymentRequestMessage, templateMessage, stickerMessage, groupInviteMessage, templateReplyMessage, productMessage, deviceSentMessage, deviceSyncMessage, listMessage, viewOnceMessage, orderMessage, listResponseMessage, ephemeralMessage, invoiceMessage, buttonsMessage, buttonsResponseMessage, paymentInviteMessage, interactiveMessage, reactionMessage, stickerSyncMessage, interactiveResponseMessage, pollCreationMessage, pollUpdateMessage, keepInChatMessage, documentWithCaptionMessage, requestPhoneNumberMessage, viewOnceV2Message, encryptedReactionMessage, editedMessage, viewOnceV2ExtensionMessage, newsletterAdminInviteMessage, deviceInfo);
    }

}
