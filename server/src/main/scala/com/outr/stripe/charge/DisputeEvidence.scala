package com.outr.stripe.charge

case class DisputeEvidence(accessActivityLog: Option[String],
                           billingAddress: Option[String],
                           cancellationPolicy: Option[String],
                           cancellationPolicyDisclosure: Option[String],
                           cancellationRebuttal: Option[String],
                           customerCommunication: Option[String],
                           customerEmailAddress: Option[String],
                           customerName: Option[String],
                           customerPurchaseIp: Option[String],
                           customerSignature: Option[String],
                           duplicateChargeDocumentation: Option[String],
                           duplicateChargeExplanation: Option[String],
                           duplicateChargeId: Option[String],
                           productDescription: Option[String],
                           receipt: Option[String],
                           refundPolicy: Option[String],
                           refundPolicyDisclosure: Option[String],
                           refundRefusalExplanation: Option[String],
                           serviceDate: Option[String],
                           serviceDocumentation: Option[String],
                           shippingAddress: Option[String],
                           shippingCarrier: Option[String],
                           shippingDate: Option[String],
                           shippingDocumentation: Option[String],
                           shippingTrackingNumber: Option[String],
                           uncategorizedFile: Option[String],
                           uncategorizedText: Option[String])